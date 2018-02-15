package org.thingml.k3;

import java.util.Map;
import org.thingml.k3.CompositeStateAspectCompositeStateAspectProperties;
import org.thingml.xtext.thingML.CompositeState;

@SuppressWarnings("all")
public class CompositeStateAspectCompositeStateAspectContext {
  public final static CompositeStateAspectCompositeStateAspectContext INSTANCE = new CompositeStateAspectCompositeStateAspectContext();
  
  public static CompositeStateAspectCompositeStateAspectProperties getSelf(final CompositeState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.thingml.k3.CompositeStateAspectCompositeStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CompositeState, CompositeStateAspectCompositeStateAspectProperties> map = new java.util.WeakHashMap<org.thingml.xtext.thingML.CompositeState, org.thingml.k3.CompositeStateAspectCompositeStateAspectProperties>();
  
  public Map<CompositeState, CompositeStateAspectCompositeStateAspectProperties> getMap() {
    return map;
  }
}
