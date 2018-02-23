package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.Function;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.FunctionCallStatement;

@SuppressWarnings("all")
public class FunctionCallStatementAdapter extends EObjectAdapter<FunctionCallStatement> implements org.thingml.xtext.thingML.FunctionCallStatement {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public FunctionCallStatementAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Function getFunction() {
    return (Function) adaptersFactory.createAdapter(adaptee.getFunction(), eResource);
  }
  
  @Override
  public void setFunction(final Function o) {
    if (o != null)
    	adaptee.setFunction(((org.thingml.xthingml.adapters.thingmlmt.thingML.FunctionAdapter) o).getAdaptee());
    else adaptee.setFunction(null);
  }
  
  private EList<Expression> parameters_;
  
  @Override
  public EList<Expression> getParameters() {
    if (parameters_ == null)
    	parameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParameters(), adaptersFactory, eResource);
    return parameters_;
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getFunctionCallStatement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.FUNCTION_CALL_STATEMENT__FUNCTION:
    		return getFunction();
    	case org.thingml.xtext.thingML.ThingMLPackage.FUNCTION_CALL_STATEMENT__PARAMETERS:
    		return getParameters();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.FUNCTION_CALL_STATEMENT__FUNCTION:
    		return getFunction() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.FUNCTION_CALL_STATEMENT__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.FUNCTION_CALL_STATEMENT__FUNCTION:
    		setFunction(
    		(org.thingml.xtext.thingML.Function)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.FUNCTION_CALL_STATEMENT__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
