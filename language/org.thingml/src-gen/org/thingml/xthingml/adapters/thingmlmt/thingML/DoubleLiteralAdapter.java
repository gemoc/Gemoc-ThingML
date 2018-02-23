package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.DoubleLiteral;

@SuppressWarnings("all")
public class DoubleLiteralAdapter extends EObjectAdapter<DoubleLiteral> implements org.thingml.xtext.thingML.DoubleLiteral {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public DoubleLiteralAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public double getDoubleValue() {
    return adaptee.getDoubleValue();
  }
  
  @Override
  public void setDoubleValue(final double o) {
    adaptee.setDoubleValue(o);
  }
  
  protected final static double DOUBLE_VALUE_EDEFAULT = 0.0;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getDoubleLiteral();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
    		return new java.lang.Double(getDoubleValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
    		return getDoubleValue() != DOUBLE_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
    		setDoubleValue(((java.lang.Double) newValue).doubleValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
