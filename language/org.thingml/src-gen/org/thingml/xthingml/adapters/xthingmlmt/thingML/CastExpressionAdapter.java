package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.CastExpression;
import org.thingml.xthingmlmt.thingML.Expression;
import org.thingml.xthingmlmt.thingML.Type;

@SuppressWarnings("all")
public class CastExpressionAdapter extends EObjectAdapter<CastExpression> implements org.thingml.xthingmlmt.thingML.CastExpression {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public CastExpressionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
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
  public Expression getTerm() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getTerm(), eResource);
  }
  
  @Override
  public void setTerm(final Expression o) {
    if (o != null)
    	adaptee.setTerm(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setTerm(null);
  }
  
  @Override
  public Type getType() {
    return (Type) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final Type o) {
    if (o != null)
    	adaptee.setType(((org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  protected final static boolean IS_ARRAY_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getCastExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__TERM:
    		return getTerm();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__TYPE:
    		return getType();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__IS_ARRAY:
    		return isIsArray() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__TERM:
    		return getTerm() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__TYPE:
    		return getType() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__IS_ARRAY:
    		return isIsArray() != IS_ARRAY_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__TERM:
    		setTerm(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__TYPE:
    		setType(
    		(org.thingml.xthingmlmt.thingML.Type)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CAST_EXPRESSION__IS_ARRAY:
    		setIsArray(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
