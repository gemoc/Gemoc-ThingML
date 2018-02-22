package org.thingml.xthingml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.thingml.xthingml.aspects.CompositeStateAspect;
import org.thingml.xthingml.aspects.ThingAspectThingAspectProperties;
import org.thingml.xthingml.thingML.Thing;

@Aspect(className = Thing.class)
@SuppressWarnings("all")
public class ThingAspect {
  @Step
  @InitializeModel
  public static void initialize(final Thing _self, final EList<String> p) {
    final org.thingml.xthingml.aspects.ThingAspectThingAspectProperties _self_ = org.thingml.xthingml.aspects.ThingAspectThingAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initialize(_self_, _self,p);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Thing","initialize");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Main
  public static void main(final Thing _self) {
	final org.thingml.xthingml.aspects.ThingAspectThingAspectProperties _self_ = org.thingml.xthingml.aspects.ThingAspectThingAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  private static void end(final Thing _self) {
    final org.thingml.xthingml.aspects.ThingAspectThingAspectProperties _self_ = org.thingml.xthingml.aspects.ThingAspectThingAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_end(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Thing","end");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_initialize(final ThingAspectThingAspectProperties _self_, final Thing _self, final EList<String> p) {
    CompositeStateAspect.initialize(_self.getBehaviour());
  }
  
  protected static void _privk3_main(final ThingAspectThingAspectProperties _self_, final Thing _self) {
    CompositeStateAspect.run(_self.getBehaviour());
    ThingAspect.end(_self);
  }
  
  protected static void _privk3_end(final ThingAspectThingAspectProperties _self_, final Thing _self) {
  }
}
