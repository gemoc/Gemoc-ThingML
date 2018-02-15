package org.thingml.k3;

import java.util.Map;
import org.thingml.k3.ThingAspectThingAspectProperties;
import org.thingml.xtext.thingML.Thing;

@SuppressWarnings("all")
public class ThingAspectThingAspectContext {
  public final static ThingAspectThingAspectContext INSTANCE = new ThingAspectThingAspectContext();
  
  public static ThingAspectThingAspectProperties getSelf(final Thing _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.thingml.k3.ThingAspectThingAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Thing, ThingAspectThingAspectProperties> map = new java.util.WeakHashMap<org.thingml.xtext.thingML.Thing, org.thingml.k3.ThingAspectThingAspectProperties>();
  
  public Map<Thing, ThingAspectThingAspectProperties> getMap() {
    return map;
  }
}
