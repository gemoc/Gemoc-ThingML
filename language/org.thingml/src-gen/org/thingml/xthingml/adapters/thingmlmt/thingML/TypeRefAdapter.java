package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.Type;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.TypeRef;

@SuppressWarnings("all")
public class TypeRefAdapter extends EObjectAdapter<TypeRef> implements org.thingml.xtext.thingML.TypeRef {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public TypeRefAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isIsArray() {
    return adaptee.isIsArray();
  }
  
  @Override
  public void setIsArray(final boolean o) {
    adaptee.setIsArray(o);
  }
  
  @Override
  public Type getType() {
    return (Type) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final Type o) {
    if (o != null)
    	adaptee.setType(((org.thingml.xthingml.adapters.thingmlmt.thingML.TypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  @Override
  public Expression getCardinality() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getCardinality(), eResource);
  }
  
  @Override
  public void setCardinality(final Expression o) {
    if (o != null)
    	adaptee.setCardinality(((org.thingml.xthingml.adapters.thingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setCardinality(null);
  }
  
  protected final static boolean IS_ARRAY_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getTypeRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__TYPE:
    		return getType();
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__IS_ARRAY:
    		return isIsArray() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__CARDINALITY:
    		return getCardinality();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__TYPE:
    		return getType() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__IS_ARRAY:
    		return isIsArray() != IS_ARRAY_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__CARDINALITY:
    		return getCardinality() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__TYPE:
    		setType(
    		(org.thingml.xtext.thingML.Type)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__IS_ARRAY:
    		setIsArray(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.TYPE_REF__CARDINALITY:
    		setCardinality(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
