package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ExpressionGroup;

@SuppressWarnings("all")
public class ExpressionGroupAdapter extends EObjectAdapter<ExpressionGroup> implements org.thingml.xtext.thingML.ExpressionGroup {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public ExpressionGroupAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getTerm() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getTerm(), eResource);
  }
  
  @Override
  public void setTerm(final Expression o) {
    if (o != null)
    	adaptee.setTerm(((org.thingml.xthingml.adapters.thingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setTerm(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getExpressionGroup();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXPRESSION_GROUP__TERM:
    		return getTerm();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXPRESSION_GROUP__TERM:
    		return getTerm() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXPRESSION_GROUP__TERM:
    		setTerm(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
