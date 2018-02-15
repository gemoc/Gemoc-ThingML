package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Variable;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Increment;

@SuppressWarnings("all")
public class IncrementAdapter extends EObjectAdapter<Increment> implements org.thingml.xtext.thingML.Increment {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public IncrementAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Variable getVar() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getVar(), eResource);
  }
  
  @Override
  public void setVar(final Variable o) {
    if (o != null)
    	adaptee.setVar(((org.thingml.xthingml.adapters.thingmlmt.thingML.VariableAdapter) o).getAdaptee());
    else adaptee.setVar(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getIncrement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INCREMENT__VAR:
    		return getVar();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INCREMENT__VAR:
    		return getVar() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INCREMENT__VAR:
    		setVar(
    		(org.thingml.xtext.thingML.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
