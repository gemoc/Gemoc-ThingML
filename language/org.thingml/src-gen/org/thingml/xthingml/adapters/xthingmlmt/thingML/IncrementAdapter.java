package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Increment;
import org.thingml.xthingmlmt.thingML.Variable;

@SuppressWarnings("all")
public class IncrementAdapter extends EObjectAdapter<Increment> implements org.thingml.xthingmlmt.thingML.Increment {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public IncrementAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Variable getVar() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getVar(), eResource);
  }
  
  @Override
  public void setVar(final Variable o) {
    if (o != null)
    	adaptee.setVar(((org.thingml.xthingml.adapters.xthingmlmt.thingML.VariableAdapter) o).getAdaptee());
    else adaptee.setVar(null);
  }
  
  @Override
  public void execute() {
    org.thingml.xthingml.aspects.ActionAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getIncrement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.INCREMENT__VAR:
    		return getVar();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.INCREMENT__VAR:
    		return getVar() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.INCREMENT__VAR:
    		setVar(
    		(org.thingml.xthingmlmt.thingML.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
