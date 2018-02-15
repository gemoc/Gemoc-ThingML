package org.thingml.k3;

import java.util.Map;
import org.thingml.k3.PrintActionAspectPrintActionAspectProperties;
import org.thingml.xtext.thingML.PrintAction;

@SuppressWarnings("all")
public class PrintActionAspectPrintActionAspectContext {
  public final static PrintActionAspectPrintActionAspectContext INSTANCE = new PrintActionAspectPrintActionAspectContext();
  
  public static PrintActionAspectPrintActionAspectProperties getSelf(final PrintAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.thingml.k3.PrintActionAspectPrintActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PrintAction, PrintActionAspectPrintActionAspectProperties> map = new java.util.WeakHashMap<org.thingml.xtext.thingML.PrintAction, org.thingml.k3.PrintActionAspectPrintActionAspectProperties>();
  
  public Map<PrintAction, PrintActionAspectPrintActionAspectProperties> getMap() {
    return map;
  }
}
