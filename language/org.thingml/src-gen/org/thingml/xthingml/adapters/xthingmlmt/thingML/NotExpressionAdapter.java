package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.NotExpression;
import org.thingml.xthingmlmt.thingML.Expression;

@SuppressWarnings("all")
public class NotExpressionAdapter extends EObjectAdapter<NotExpression> implements org.thingml.xthingmlmt.thingML.NotExpression {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public NotExpressionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
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
  public Object evaluate() {
    return org.thingml.xthingml.aspects.ExpressionAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getNotExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.NOT_EXPRESSION__TERM:
    		return getTerm();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.NOT_EXPRESSION__TERM:
    		return getTerm() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.NOT_EXPRESSION__TERM:
    		setTerm(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
