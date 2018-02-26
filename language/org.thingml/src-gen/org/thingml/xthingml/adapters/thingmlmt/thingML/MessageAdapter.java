package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Message;

@SuppressWarnings("all")
public class MessageAdapter extends EObjectAdapter<Message> implements org.thingml.xtext.thingML.Message {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public MessageAdapter() {
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
  
  private EList<Parameter> parameters_;
  
  @Override
  public EList<Parameter> getParameters() {
    if (parameters_ == null)
    	parameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParameters(), adaptersFactory, eResource);
    return parameters_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getMessage();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__PARAMETERS:
    		return getParameters();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xtext.thingML.AnnotatedElement.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__ANNOTATIONS:
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
    			return org.thingml.xtext.thingML.ThingMLPackage.MESSAGE__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}