package org.thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.thingml.xtext.thingML.Thing

@Aspect(className=Thing)
class ThingAspect {
     @Main
     def public void main() {
         println("Hello world!")
     }
}
