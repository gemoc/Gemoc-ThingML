package org.thingml.k3

import static extension org.thingml.k3.TypeAspect.*
import static extension org.thingml.k3.PortAspect.*
import static extension org.thingml.k3.HandlerAspect.*
import static extension org.thingml.k3.EventAspect.*
import static extension org.thingml.k3.ActionAspect.*
import static extension org.thingml.k3.CompositeStateAspect.*
import static extension org.thingml.k3.ExpressionAspect.*

import fr.inria.diverse.k3.al.annotationprocessor.Abstract
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.Action
import org.thingml.xtext.thingML.ActionBlock
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.Event
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.Handler
import org.thingml.xtext.thingML.Message
import org.thingml.xtext.thingML.Port
import org.thingml.xtext.thingML.PrintAction
import org.thingml.xtext.thingML.ReceiveMessage
import org.thingml.xtext.thingML.SendAction
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.StringLiteral
import org.thingml.xtext.thingML.Thing
import org.thingml.xtext.thingML.ThingMLModel
import org.thingml.xtext.thingML.Transition
import org.thingml.xtext.thingML.Type

@Aspect(className=ThingMLModel)
class ThingMLModelAspect {
    @Step
    @InitializeModel
    def public void initialize(EList<String> p) {
        for (Type type : _self.types) {
            type.initialize()
        }
    }

    @Main
    def public void main() {
        for (Type type : _self.types) {
            type.run()
        }
        _self.end()
    }

    @Step
    def private void end() {
        // Do nothing
    }
}

@Aspect(className=Type)
class TypeAspect {
    @Abstract
    def public void initialize() {
    }

    @Abstract
    def public void run() {
    }
}

@Aspect(className=Thing)
class ThingAspect extends TypeAspect {
    @OverrideAspectMethod
    @Step
    def public void initialize() {
        if (_self.fragment) return;

        if (_self.behaviour !== null) {
            _self.behaviour.initialize()
        }
    }

    @OverrideAspectMethod
    @Step
    def public void run() {
        if (_self.fragment) return;

        if (_self.behaviour !== null) {
            _self.behaviour.run()
        }
    }
}

@Aspect(className=Port)
class PortAspect {
    // Works as a queue
    // If a connected thing looks for a message, it will consume it

    public EList<Message> messages

    def public boolean hasReceived(Message message) {
        if (_self.messages.length > 0) {
            val first = _self.messages.get(0)
            println(first.name)
            if (message.name == first.name) {
                _self.messages.remove(0)
                return true
            }
        }
        return false
    }

    def public void sends(Message message) {
        _self.messages.add(0, message)
    }
}

@Aspect(className=State)
class StateAspect {
    @Step
    def public State run() {
        // Simulate indeterminism in case of multiple possibilities

        val validTransitions = _self.outgoing.filter[t | t.isValid()]         // return a generator =(
        val validInternalTransitions = _self.internal.filter[t | t.isValid()] // return a generator =/
        val transitions = validTransitions + validInternalTransitions         // is a generator too ><
        println(transitions)                                                  // generator is evaluated here

        if (!transitions.empty) {                                             // AND here ! >< not what we want !
            val transition = transitions.get(0)
            val new_state = transition.fire(_self)

            return new_state
        }

        return _self
    }
}

@Aspect(className=Handler)
class HandlerAspect {
    def public boolean isValid() {
        var guard_ok = _self.guard === null
        if (!guard_ok) {
            guard_ok = false // TODO
        }
        var event_ok = _self.event === null
        if (!event_ok) {
            event_ok = _self.event.happened()
        }
        return guard_ok && event_ok
    }

    @Step
    def public State fire(State state) {
        _self.action.execute()

        return state
    }
}

@Aspect(className=Transition)
class TransitionAspect extends HandlerAspect {
    @OverrideAspectMethod
    @Step
    def public State fire(State state) {
        if (state.exit !== null) {
            state.exit.execute()
        }

        _self.super_fire(state)

        val new_state = _self.target

        if (new_state.entry !== null) {
            new_state.entry.execute()
        }

        return _self.target
    }
}

@Aspect(className=CompositeState)
class CompositeStateAspect extends StateAspect {
    public State currentState

    def public void initialize() {
        _self.currentState = _self.initial
        if (_self.entry !== null) {
            _self.entry.execute()
        }
        if (_self.currentState.entry !== null) {
            _self.currentState.entry.execute()
        }
    }

    @OverrideAspectMethod
    @Step
    def public State run() {
        _self.currentState = _self.currentState.run()
        return _self.currentState
    }
}

@Aspect(className=Event)
class EventAspect {
    @Abstract
    def public boolean happened() {
        return false
    }
}

@Aspect(className=ReceiveMessage)
class ReceiveMessageAspect extends EventAspect {
    @OverrideAspectMethod
    def public boolean happened() {
        return _self.port.hasReceived(_self.message)
    }
}

@Aspect(className=Action)
class ActionAspect {
    @Abstract
    def public void execute() {
        println('Abstract action')
        println(_self)
    }
}

@Aspect(className=ActionBlock)
class ActionBlockAspect extends ActionAspect {
    @OverrideAspectMethod
    def public void execute() {
        for (Action action : _self.actions) {
            action.execute()
        }
    }
}

@Aspect(className=SendAction)
class SendActionAspect extends ActionAspect {
    @OverrideAspectMethod
    def public void execute() {
        _self.port.sends(_self.message)
    }
}

@Aspect(className=PrintAction)
class PrintActionAspect extends ActionAspect {
    @OverrideAspectMethod
    def public void execute() {
        print(_self.msg.get(0).evaluate())
    }
}

@Aspect(className=Expression)
class ExpressionAspect {
    @Abstract
    def public Object evaluate() {
    }
}

@Aspect(className=StringLiteral)
class StringLiteralAspect extends ExpressionAspect {
    @OverrideAspectMethod
    def public String evaluate() {
        return _self.stringValue.replace("\\n", "\n")
    }
}
