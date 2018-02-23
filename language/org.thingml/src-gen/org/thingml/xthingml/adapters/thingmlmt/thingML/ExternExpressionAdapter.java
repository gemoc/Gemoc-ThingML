package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ExternExpression;

@SuppressWarnings("all")
public class ExternExpressionAdapter extends EObjectAdapter<ExternExpression> implements org.thingml.xtext.thingML.ExternExpression {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public ExternExpressionAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getExpression() {
    return adaptee.getExpression();
  }
  
  @Override
  public void setExpression(final String o) {
    adaptee.setExpression(o);
  }
  
  private EList<Expression> segments_;
  
  @Override
  public EList<Expression> getSegments() {
    if (segments_ == null)
    	segments_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSegments(), adaptersFactory, eResource);
    return segments_;
  }
  
  protected final static String EXPRESSION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getExternExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_EXPRESSION__EXPRESSION:
    		return getExpression();
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_EXPRESSION__SEGMENTS:
    		return getSegments();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_EXPRESSION__EXPRESSION:
    		return getExpression() != EXPRESSION_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_EXPRESSION__SEGMENTS:
    		return getSegments() != null && !getSegments().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_EXPRESSION__EXPRESSION:
    		setExpression(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_EXPRESSION__SEGMENTS:
    		getSegments().clear();
    		getSegments().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
