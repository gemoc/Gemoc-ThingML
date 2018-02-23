package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ByteLiteral;

@SuppressWarnings("all")
public class ByteLiteralAdapter extends EObjectAdapter<ByteLiteral> implements org.thingml.xtext.thingML.ByteLiteral {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public ByteLiteralAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public byte getByteValue() {
    return adaptee.getByteValue();
  }
  
  @Override
  public void setByteValue(final byte o) {
    adaptee.setByteValue(o);
  }
  
  protected final static byte BYTE_VALUE_EDEFAULT = 0x00;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getByteLiteral();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.BYTE_LITERAL__BYTE_VALUE:
    		return new java.lang.Byte(getByteValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.BYTE_LITERAL__BYTE_VALUE:
    		return getByteValue() != BYTE_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.BYTE_LITERAL__BYTE_VALUE:
    		setByteValue(((java.lang.Byte) newValue).byteValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
