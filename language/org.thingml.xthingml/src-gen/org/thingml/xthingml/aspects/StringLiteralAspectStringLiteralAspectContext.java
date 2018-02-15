package org.thingml.xthingml.aspects;

import java.util.Map;
import org.thingml.xthingml.aspects.StringLiteralAspectStringLiteralAspectProperties;
import org.thingml.xthingml.thingML.StringLiteral;

@SuppressWarnings("all")
public class StringLiteralAspectStringLiteralAspectContext {
  public final static StringLiteralAspectStringLiteralAspectContext INSTANCE = new StringLiteralAspectStringLiteralAspectContext();
  
  public static StringLiteralAspectStringLiteralAspectProperties getSelf(final StringLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.thingml.xthingml.aspects.StringLiteralAspectStringLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringLiteral, StringLiteralAspectStringLiteralAspectProperties> map = new java.util.WeakHashMap<org.thingml.xthingml.thingML.StringLiteral, org.thingml.xthingml.aspects.StringLiteralAspectStringLiteralAspectProperties>();
  
  public Map<StringLiteral, StringLiteralAspectStringLiteralAspectProperties> getMap() {
    return map;
  }
}
