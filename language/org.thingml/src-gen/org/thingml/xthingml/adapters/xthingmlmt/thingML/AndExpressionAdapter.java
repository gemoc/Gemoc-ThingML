package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.AndExpression;
import org.thingml.xthingmlmt.thingML.Expression;

@SuppressWarnings("all")
public class AndExpressionAdapter extends EObjectAdapter<AndExpression> implements org.thingml.xthingmlmt.thingML.AndExpression {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public AndExpressionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getLhs() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final Expression o) {
    if (o != null)
    	adaptee.setLhs(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public Expression getRhs() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final Expression o) {
    if (o != null)
    	adaptee.setRhs(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public Object evaluate() {
    return org.thingml.xthingml.aspects.ExpressionAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getAndExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.AND_EXPRESSION__LHS:
    		return getLhs();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.AND_EXPRESSION__RHS:
    		return getRhs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.AND_EXPRESSION__LHS:
    		return getLhs() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.AND_EXPRESSION__RHS:
    		return getRhs() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.AND_EXPRESSION__LHS:
    		setLhs(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.AND_EXPRESSION__RHS:
    		setRhs(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
