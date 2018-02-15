package org.thingml.k3;

import java.util.Map;
import org.thingml.k3.StringLiteralAspectStringLiteralAspectProperties;
import org.thingml.xtext.thingML.StringLiteral;

@SuppressWarnings("all")
public class StringLiteralAspectStringLiteralAspectContext {
  public final static StringLiteralAspectStringLiteralAspectContext INSTANCE = new StringLiteralAspectStringLiteralAspectContext();
  
  public static StringLiteralAspectStringLiteralAspectProperties getSelf(final StringLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.thingml.k3.StringLiteralAspectStringLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringLiteral, StringLiteralAspectStringLiteralAspectProperties> map = new java.util.WeakHashMap<org.thingml.xtext.thingML.StringLiteral, org.thingml.k3.StringLiteralAspectStringLiteralAspectProperties>();
  
  public Map<StringLiteral, StringLiteralAspectStringLiteralAspectProperties> getMap() {
    return map;
  }
}
