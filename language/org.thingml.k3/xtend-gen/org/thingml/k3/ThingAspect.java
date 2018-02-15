package org.thingml.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.thingml.k3.ThingAspectThingAspectProperties;
import org.thingml.xtext.thingML.Thing;

@Aspect(className = Thing.class)
@SuppressWarnings("all")
public class ThingAspect {
  @Main
  public static void main(final Thing _self) {
    final org.thingml.k3.ThingAspectThingAspectProperties _self_ = org.thingml.k3.ThingAspectThingAspectContext.getSelf(_self);
    _privk3_main(_self_, _self);;
  }
  
  protected static void _privk3_main(final ThingAspectThingAspectProperties _self_, final Thing _self) {
    InputOutput.<String>println("Hello world!");
  }
}
