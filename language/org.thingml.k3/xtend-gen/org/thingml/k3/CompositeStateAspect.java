package org.thingml.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.thingml.k3.ActionAspect;
import org.thingml.k3.CompositeStateAspectCompositeStateAspectProperties;
import org.thingml.k3.StateAspect;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.Transition;

@Aspect(className = CompositeState.class)
@SuppressWarnings("all")
public class CompositeStateAspect extends StateAspect {
  public static void initialize(final CompositeState _self) {
    final org.thingml.k3.CompositeStateAspectCompositeStateAspectProperties _self_ = org.thingml.k3.CompositeStateAspectCompositeStateAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);;
  }
  
  @Step
  public static void run(final CompositeState _self) {
    final org.thingml.k3.CompositeStateAspectCompositeStateAspectProperties _self_ = org.thingml.k3.CompositeStateAspectCompositeStateAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_run(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self, new Object[] {_self}, command, "CompositeState", "run");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static State currentState(final CompositeState _self) {
    final org.thingml.k3.CompositeStateAspectCompositeStateAspectProperties _self_ = org.thingml.k3.CompositeStateAspectCompositeStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentState(_self_, _self);;
    return (org.thingml.xtext.thingML.State)result;
  }
  
  public static void currentState(final CompositeState _self, final State currentState) {
    final org.thingml.k3.CompositeStateAspectCompositeStateAspectProperties _self_ = org.thingml.k3.CompositeStateAspectCompositeStateAspectContext.getSelf(_self);
    _privk3_currentState(_self_, _self,currentState);;
  }
  
  protected static void _privk3_initialize(final CompositeStateAspectCompositeStateAspectProperties _self_, final CompositeState _self) {
    CompositeStateAspect.currentState(_self, _self.getInitial());
  }
  
  protected static void _privk3_run(final CompositeStateAspectCompositeStateAspectProperties _self_, final CompositeState _self) {
    final Transition transition = StateAspect.getTransition(CompositeStateAspect.currentState(_self));
    if ((transition != null)) {
      Action _exit = CompositeStateAspect.currentState(_self).getExit();
      boolean _tripleNotEquals = (_exit != null);
      if (_tripleNotEquals) {
        ActionAspect.execute(CompositeStateAspect.currentState(_self).getExit());
      }
      ActionAspect.execute(transition.getAction());
      CompositeStateAspect.currentState(_self, transition.getTarget());
      Action _entry = CompositeStateAspect.currentState(_self).getEntry();
      boolean _tripleNotEquals_1 = (_entry != null);
      if (_tripleNotEquals_1) {
        ActionAspect.execute(CompositeStateAspect.currentState(_self).getEntry());
      }
    }
  }
  
  protected static State _privk3_currentState(final CompositeStateAspectCompositeStateAspectProperties _self_, final CompositeState _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.thingml.xtext.thingML.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final CompositeStateAspectCompositeStateAspectProperties _self_, final CompositeState _self, final State currentState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentState = currentState;
    }
  }
}
