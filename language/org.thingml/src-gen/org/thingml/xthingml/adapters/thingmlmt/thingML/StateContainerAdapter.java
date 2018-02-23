package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.State;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.StateContainer;

@SuppressWarnings("all")
public class StateContainerAdapter extends EObjectAdapter<StateContainer> implements org.thingml.xtext.thingML.StateContainer {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public StateContainerAdapter() {
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
  
  @Override
  public boolean isHistory() {
    return adaptee.isHistory();
  }
  
  @Override
  public void setHistory(final boolean o) {
    adaptee.setHistory(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  @Override
  public State getInitial() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitial(), eResource);
  }
  
  @Override
  public void setInitial(final State o) {
    if (o != null)
    	adaptee.setInitial(((org.thingml.xthingml.adapters.thingmlmt.thingML.StateAdapter) o).getAdaptee());
    else adaptee.setInitial(null);
  }
  
  private EList<State> substate_;
  
  @Override
  public EList<State> getSubstate() {
    if (substate_ == null)
    	substate_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubstate(), adaptersFactory, eResource);
    return substate_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean HISTORY_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getStateContainer();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__INITIAL:
    		return getInitial();
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__HISTORY:
    		return isHistory() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__SUBSTATE:
    		return getSubstate();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__INITIAL:
    		return getInitial() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__HISTORY:
    		return isHistory() != HISTORY_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__SUBSTATE:
    		return getSubstate() != null && !getSubstate().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__INITIAL:
    		setInitial(
    		(org.thingml.xtext.thingML.State)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__HISTORY:
    		setHistory(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__SUBSTATE:
    		getSubstate().clear();
    		getSubstate().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xtext.thingML.AnnotatedElement.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__ANNOTATIONS:
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
    			return org.thingml.xtext.thingML.ThingMLPackage.STATE_CONTAINER__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
