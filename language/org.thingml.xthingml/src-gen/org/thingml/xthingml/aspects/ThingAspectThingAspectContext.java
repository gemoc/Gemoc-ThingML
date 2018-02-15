package org.thingml.xthingml.aspects;

import java.util.Map;
import org.thingml.xthingml.aspects.ThingAspectThingAspectProperties;
import org.thingml.xthingml.thingML.Thing;

@SuppressWarnings("all")
public class ThingAspectThingAspectContext {
  public final static ThingAspectThingAspectContext INSTANCE = new ThingAspectThingAspectContext();
  
  public static ThingAspectThingAspectProperties getSelf(final Thing _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.thingml.xthingml.aspects.ThingAspectThingAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Thing, ThingAspectThingAspectProperties> map = new java.util.WeakHashMap<org.thingml.xthingml.thingML.Thing, org.thingml.xthingml.aspects.ThingAspectThingAspectProperties>();
  
  public Map<Thing, ThingAspectThingAspectProperties> getMap() {
    return map;
  }
}
