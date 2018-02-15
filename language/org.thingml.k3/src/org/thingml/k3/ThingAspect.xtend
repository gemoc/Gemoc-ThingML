package org.thingml.k3

import static extension org.thingml.k3.ActionAspect.*
import static extension org.thingml.k3.CompositeStateAspect.*
import static extension org.thingml.k3.ExpressionAspect.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.Action
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.PrintAction
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.StringLiteral
import org.thingml.xtext.thingML.Thing
import org.thingml.xtext.thingML.Transition

@Aspect(className=Thing)
class ThingAspect {
    @Step
    @InitializeModel
    def public void initialize(EList<String> p) {
        _self.behaviour.initialize()
    }

    @Main
    def public void main() {
        _self.behaviour.run()
        _self.end()
    }
    
    @Step
    def private void end() {
    }
}

@Aspect(className=State)
class StateAspect {
    def public Transition getTransition() {
        // Simulate indeterminism in case of multiple possibilities
        val validTransitions = _self.outgoing.filter[t | t.guard === null && t.event === null]

        if (validTransitions.empty) {
            return null
        } else {
            return validTransitions.get(0)
        }
    }
}

@Aspect(className=CompositeState)
class CompositeStateAspect extends StateAspect {
    public State currentState

    def public void initialize() {
        _self.currentState = _self.initial
    }

    @Step
    def public void run() {
        val transition = _self.currentState.getTransition()
        if (transition !== null) {
            if (_self.currentState.exit !== null) {
                _self.currentState.exit.execute()
            }
            transition.action.execute()
            _self.currentState = transition.target
            if (_self.currentState.entry !== null) {
                _self.currentState.entry.execute()
            }
        }
    }
}

@Aspect(className=Action)
class ActionAspect {
    def public void execute() {
    }
}

@Aspect(className=PrintAction)
class PrintActionAspect extends ActionAspect {
    def public void execute() {
        print(_self.msg.get(0).evaluate())
    }
}

@Aspect(className=Expression)
class ExpressionAspect {
    def public Object evaluate() {
        return null
    }
}

@Aspect(className=StringLiteral)
class StringLiteralAspect extends ExpressionAspect {
    def public String evaluate() {
        return _self.stringValue.replace("\\n", "\n")
    }
}
