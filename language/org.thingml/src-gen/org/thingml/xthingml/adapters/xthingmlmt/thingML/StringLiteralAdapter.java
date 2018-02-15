package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.StringLiteral;

@SuppressWarnings("all")
public class StringLiteralAdapter extends EObjectAdapter<StringLiteral> implements org.thingml.xthingmlmt.thingML.StringLiteral {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public StringLiteralAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getStringValue() {
    return adaptee.getStringValue();
  }
  
  @Override
  public void setStringValue(final String o) {
    adaptee.setStringValue(o);
  }
  
  @Override
  public String evaluate() {
    return org.thingml.xthingml.aspects.StringLiteralAspect.evaluate(adaptee);
  }
  
  protected final static String STRING_VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getStringLiteral();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STRING_LITERAL__STRING_VALUE:
    		return getStringValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STRING_LITERAL__STRING_VALUE:
    		return getStringValue() != STRING_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STRING_LITERAL__STRING_VALUE:
    		setStringValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
