package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Enumeration;
import org.thingml.xtext.thingML.EnumerationLiteral;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.EnumLiteralRef;

@SuppressWarnings("all")
public class EnumLiteralRefAdapter extends EObjectAdapter<EnumLiteralRef> implements org.thingml.xtext.thingML.EnumLiteralRef {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public EnumLiteralRefAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Enumeration getEnum() {
    return (Enumeration) adaptersFactory.createAdapter(adaptee.getEnum(), eResource);
  }
  
  @Override
  public void setEnum(final Enumeration o) {
    if (o != null)
    	adaptee.setEnum(((org.thingml.xthingml.adapters.thingmlmt.thingML.EnumerationAdapter) o).getAdaptee());
    else adaptee.setEnum(null);
  }
  
  @Override
  public EnumerationLiteral getLiteral() {
    return (EnumerationLiteral) adaptersFactory.createAdapter(adaptee.getLiteral(), eResource);
  }
  
  @Override
  public void setLiteral(final EnumerationLiteral o) {
    if (o != null)
    	adaptee.setLiteral(((org.thingml.xthingml.adapters.thingmlmt.thingML.EnumerationLiteralAdapter) o).getAdaptee());
    else adaptee.setLiteral(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getEnumLiteralRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUM_LITERAL_REF__ENUM:
    		return getEnum();
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUM_LITERAL_REF__LITERAL:
    		return getLiteral();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUM_LITERAL_REF__ENUM:
    		return getEnum() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUM_LITERAL_REF__LITERAL:
    		return getLiteral() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUM_LITERAL_REF__ENUM:
    		setEnum(
    		(org.thingml.xtext.thingML.Enumeration)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUM_LITERAL_REF__LITERAL:
    		setLiteral(
    		(org.thingml.xtext.thingML.EnumerationLiteral)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
