package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.DoubleLiteral;

@SuppressWarnings("all")
public class DoubleLiteralAdapter extends EObjectAdapter<DoubleLiteral> implements org.thingml.xthingmlmt.thingML.DoubleLiteral {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public DoubleLiteralAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public double getDoubleValue() {
    return adaptee.getDoubleValue();
  }
  
  @Override
  public void setDoubleValue(final double o) {
    adaptee.setDoubleValue(o);
  }
  
  @Override
  public Object evaluate() {
    return org.thingml.xthingml.aspects.ExpressionAspect.evaluate(adaptee);
  }
  
  protected final static double DOUBLE_VALUE_EDEFAULT = 0.0;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getDoubleLiteral();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
    		return new java.lang.Double(getDoubleValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
    		return getDoubleValue() != DOUBLE_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
    		setDoubleValue(((java.lang.Double) newValue).doubleValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
