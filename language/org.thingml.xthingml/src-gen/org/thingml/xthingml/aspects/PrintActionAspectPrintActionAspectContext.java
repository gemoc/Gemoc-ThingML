package org.thingml.xthingml.aspects;

import java.util.Map;
import org.thingml.xthingml.aspects.PrintActionAspectPrintActionAspectProperties;
import org.thingml.xthingml.thingML.PrintAction;

@SuppressWarnings("all")
public class PrintActionAspectPrintActionAspectContext {
  public final static PrintActionAspectPrintActionAspectContext INSTANCE = new PrintActionAspectPrintActionAspectContext();
  
  public static PrintActionAspectPrintActionAspectProperties getSelf(final PrintAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.thingml.xthingml.aspects.PrintActionAspectPrintActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PrintAction, PrintActionAspectPrintActionAspectProperties> map = new java.util.WeakHashMap<org.thingml.xthingml.thingML.PrintAction, org.thingml.xthingml.aspects.PrintActionAspectPrintActionAspectProperties>();
  
  public Map<PrintAction, PrintActionAspectPrintActionAspectProperties> getMap() {
    return map;
  }
}
