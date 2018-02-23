package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.EnumerationLiteral;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Enumeration;

@SuppressWarnings("all")
public class EnumerationAdapter extends EObjectAdapter<Enumeration> implements org.thingml.xtext.thingML.Enumeration {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public EnumerationAdapter() {
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
  
  private EList<EnumerationLiteral> literals_;
  
  @Override
  public EList<EnumerationLiteral> getLiterals() {
    if (literals_ == null)
    	literals_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLiterals(), adaptersFactory, eResource);
    return literals_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getEnumeration();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__LITERALS:
    		return getLiterals();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__LITERALS:
    		return getLiterals() != null && !getLiterals().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.ENUMERATION__LITERALS:
    		getLiterals().clear();
    		getLiterals().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
