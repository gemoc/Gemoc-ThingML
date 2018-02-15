package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Variable;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.PropertyReference;

@SuppressWarnings("all")
public class PropertyReferenceAdapter extends EObjectAdapter<PropertyReference> implements org.thingml.xtext.thingML.PropertyReference {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public PropertyReferenceAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Variable getProperty() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getProperty(), eResource);
  }
  
  @Override
  public void setProperty(final Variable o) {
    if (o != null)
    	adaptee.setProperty(((org.thingml.xthingml.adapters.thingmlmt.thingML.VariableAdapter) o).getAdaptee());
    else adaptee.setProperty(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getPropertyReference();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_REFERENCE__PROPERTY:
    		return getProperty();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_REFERENCE__PROPERTY:
    		return getProperty() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_REFERENCE__PROPERTY:
    		setProperty(
    		(org.thingml.xtext.thingML.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
