package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.EnumLiteralRef;
import org.thingml.xthingmlmt.thingML.Enumeration;
import org.thingml.xthingmlmt.thingML.EnumerationLiteral;

@SuppressWarnings("all")
public class EnumLiteralRefAdapter extends EObjectAdapter<EnumLiteralRef> implements org.thingml.xthingmlmt.thingML.EnumLiteralRef {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public EnumLiteralRefAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Enumeration getEnum() {
    return (Enumeration) adaptersFactory.createAdapter(adaptee.getEnum(), eResource);
  }
  
  @Override
  public void setEnum(final Enumeration o) {
    if (o != null)
    	adaptee.setEnum(((org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationAdapter) o).getAdaptee());
    else adaptee.setEnum(null);
  }
  
  @Override
  public EnumerationLiteral getLiteral() {
    return (EnumerationLiteral) adaptersFactory.createAdapter(adaptee.getLiteral(), eResource);
  }
  
  @Override
  public void setLiteral(final EnumerationLiteral o) {
    if (o != null)
    	adaptee.setLiteral(((org.thingml.xthingml.adapters.xthingmlmt.thingML.EnumerationLiteralAdapter) o).getAdaptee());
    else adaptee.setLiteral(null);
  }
  
  @Override
  public Object evaluate() {
    return org.thingml.xthingml.aspects.ExpressionAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getEnumLiteralRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ENUM_LITERAL_REF__ENUM:
    		return getEnum();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ENUM_LITERAL_REF__LITERAL:
    		return getLiteral();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ENUM_LITERAL_REF__ENUM:
    		return getEnum() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ENUM_LITERAL_REF__LITERAL:
    		return getLiteral() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ENUM_LITERAL_REF__ENUM:
    		setEnum(
    		(org.thingml.xthingmlmt.thingML.Enumeration)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ENUM_LITERAL_REF__LITERAL:
    		setLiteral(
    		(org.thingml.xthingmlmt.thingML.EnumerationLiteral)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
