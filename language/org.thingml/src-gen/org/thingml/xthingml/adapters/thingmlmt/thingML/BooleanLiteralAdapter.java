package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.BooleanLiteral;

@SuppressWarnings("all")
public class BooleanLiteralAdapter extends EObjectAdapter<BooleanLiteral> implements org.thingml.xtext.thingML.BooleanLiteral {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public BooleanLiteralAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isBoolValue() {
    return adaptee.isBoolValue();
  }
  
  @Override
  public void setBoolValue(final boolean o) {
    adaptee.setBoolValue(o);
  }
  
  protected final static boolean BOOL_VALUE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getBooleanLiteral();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.BOOLEAN_LITERAL__BOOL_VALUE:
    		return isBoolValue() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.BOOLEAN_LITERAL__BOOL_VALUE:
    		return isBoolValue() != BOOL_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.BOOLEAN_LITERAL__BOOL_VALUE:
    		setBoolValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
