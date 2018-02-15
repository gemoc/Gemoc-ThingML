package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.BooleanLiteral;

@SuppressWarnings("all")
public class BooleanLiteralAdapter extends EObjectAdapter<BooleanLiteral> implements org.thingml.xthingmlmt.thingML.BooleanLiteral {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public BooleanLiteralAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
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
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getBooleanLiteral();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.BOOLEAN_LITERAL__BOOL_VALUE:
    		return isBoolValue() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.BOOLEAN_LITERAL__BOOL_VALUE:
    		return isBoolValue() != BOOL_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.BOOLEAN_LITERAL__BOOL_VALUE:
    		setBoolValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
