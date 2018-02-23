package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.UnaryMinus;

@SuppressWarnings("all")
public class UnaryMinusAdapter extends EObjectAdapter<UnaryMinus> implements org.thingml.xtext.thingML.UnaryMinus {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public UnaryMinusAdapter() {
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
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getUnaryMinus();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.UNARY_MINUS__TERM:
    		return getTerm();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.UNARY_MINUS__TERM:
    		return getTerm() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.UNARY_MINUS__TERM:
    		setTerm(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
