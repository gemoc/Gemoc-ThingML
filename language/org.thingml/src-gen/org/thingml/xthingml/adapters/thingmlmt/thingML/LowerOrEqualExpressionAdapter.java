package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.LowerOrEqualExpression;

@SuppressWarnings("all")
public class LowerOrEqualExpressionAdapter extends EObjectAdapter<LowerOrEqualExpression> implements org.thingml.xtext.thingML.LowerOrEqualExpression {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public LowerOrEqualExpressionAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getLhs() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final Expression o) {
    if (o != null)
    	adaptee.setLhs(((org.thingml.xthingml.adapters.thingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public Expression getRhs() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final Expression o) {
    if (o != null)
    	adaptee.setRhs(((org.thingml.xthingml.adapters.thingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getLowerOrEqualExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.LOWER_OR_EQUAL_EXPRESSION__LHS:
    		return getLhs();
    	case org.thingml.xtext.thingML.ThingMLPackage.LOWER_OR_EQUAL_EXPRESSION__RHS:
    		return getRhs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.LOWER_OR_EQUAL_EXPRESSION__LHS:
    		return getLhs() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.LOWER_OR_EQUAL_EXPRESSION__RHS:
    		return getRhs() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.LOWER_OR_EQUAL_EXPRESSION__LHS:
    		setLhs(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.LOWER_OR_EQUAL_EXPRESSION__RHS:
    		setRhs(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
