package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Variable;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements org.thingml.xtext.thingML.Variable {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  @Override
  public TypeRef getTypeRef() {
    return (TypeRef) adaptersFactory.createAdapter(adaptee.getTypeRef(), eResource);
  }
  
  @Override
  public void setTypeRef(final TypeRef o) {
    if (o != null)
    	adaptee.setTypeRef(((org.thingml.xthingml.adapters.thingmlmt.thingML.TypeRefAdapter) o).getAdaptee());
    else adaptee.setTypeRef(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__TYPE_REF:
    		return getTypeRef();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__TYPE_REF:
    		return getTypeRef() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__TYPE_REF:
    		setTypeRef(
    		(org.thingml.xtext.thingML.TypeRef)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xtext.thingML.AnnotatedElement.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__ANNOTATIONS:
    			return org.thingml.xtext.thingML.ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xtext.thingML.AnnotatedElement.class) {
    	switch (baseFeatureID) {
    		case org.thingml.xtext.thingML.ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS:
    			return org.thingml.xtext.thingML.ThingMLPackage.VARIABLE__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
