package org.thingml.xthingml.aspects;

import java.util.Map;
import org.thingml.xthingml.aspects.CompositeStateAspectCompositeStateAspectProperties;
import org.thingml.xthingml.thingML.CompositeState;

@SuppressWarnings("all")
public class CompositeStateAspectCompositeStateAspectContext {
  public final static CompositeStateAspectCompositeStateAspectContext INSTANCE = new CompositeStateAspectCompositeStateAspectContext();
  
  public static CompositeStateAspectCompositeStateAspectProperties getSelf(final CompositeState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.thingml.xthingml.aspects.CompositeStateAspectCompositeStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CompositeState, CompositeStateAspectCompositeStateAspectProperties> map = new java.util.WeakHashMap<org.thingml.xthingml.thingML.CompositeState, org.thingml.xthingml.aspects.CompositeStateAspectCompositeStateAspectProperties>();
  
  public Map<CompositeState, CompositeStateAspectCompositeStateAspectProperties> getMap() {
    return map;
  }
}
