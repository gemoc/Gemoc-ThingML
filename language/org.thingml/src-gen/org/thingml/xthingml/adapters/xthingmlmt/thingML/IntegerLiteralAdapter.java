package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.IntegerLiteral;

@SuppressWarnings("all")
public class IntegerLiteralAdapter extends EObjectAdapter<IntegerLiteral> implements org.thingml.xthingmlmt.thingML.IntegerLiteral {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public IntegerLiteralAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getIntValue() {
    return adaptee.getIntValue();
  }
  
  @Override
  public void setIntValue(final int o) {
    adaptee.setIntValue(o);
  }
  
  @Override
  public Object evaluate() {
    return org.thingml.xthingml.aspects.ExpressionAspect.evaluate(adaptee);
  }
  
  protected final static int INT_VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getIntegerLiteral();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.INTEGER_LITERAL__INT_VALUE:
    		return new java.lang.Integer(getIntValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.INTEGER_LITERAL__INT_VALUE:
    		return getIntValue() != INT_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.INTEGER_LITERAL__INT_VALUE:
    		setIntValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}