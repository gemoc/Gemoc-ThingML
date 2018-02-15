package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.CharLiteral;

@SuppressWarnings("all")
public class CharLiteralAdapter extends EObjectAdapter<CharLiteral> implements org.thingml.xtext.thingML.CharLiteral {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public CharLiteralAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public byte getCharValue() {
    return adaptee.getCharValue();
  }
  
  @Override
  public void setCharValue(final byte o) {
    adaptee.setCharValue(o);
  }
  
  protected final static byte CHAR_VALUE_EDEFAULT = 0x00;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getCharLiteral();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.CHAR_LITERAL__CHAR_VALUE:
    		return new java.lang.Byte(getCharValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.CHAR_LITERAL__CHAR_VALUE:
    		return getCharValue() != CHAR_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.CHAR_LITERAL__CHAR_VALUE:
    		setCharValue(((java.lang.Byte) newValue).byteValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
