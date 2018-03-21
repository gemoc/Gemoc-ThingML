package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.State;
import org.thingml.xthingmlmt.thingML.Action;
import org.thingml.xthingmlmt.thingML.InternalTransition;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.Property;
import org.thingml.xthingmlmt.thingML.Transition;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements org.thingml.xthingmlmt.thingML.State {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
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
  
  private EList<Property> properties_;
  
  @Override
  public EList<Property> getProperties() {
    if (properties_ == null)
    	properties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProperties(), adaptersFactory, eResource);
    return properties_;
  }
  
  @Override
  public Action getEntry() {
    return (Action) adaptersFactory.createAdapter(adaptee.getEntry(), eResource);
  }
  
  @Override
  public void setEntry(final Action o) {
    if (o != null)
    	adaptee.setEntry(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter) o).getAdaptee());
    else adaptee.setEntry(null);
  }
  
  @Override
  public Action getExit() {
    return (Action) adaptersFactory.createAdapter(adaptee.getExit(), eResource);
  }
  
  @Override
  public void setExit(final Action o) {
    if (o != null)
    	adaptee.setExit(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter) o).getAdaptee());
    else adaptee.setExit(null);
  }
  
  private EList<InternalTransition> internal_;
  
  @Override
  public EList<InternalTransition> getInternal() {
    if (internal_ == null)
    	internal_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInternal(), adaptersFactory, eResource);
    return internal_;
  }
  
  private EList<Transition> outgoing_;
  
  @Override
  public EList<Transition> getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
  }
  
  @Override
  public org.thingml.xthingmlmt.thingML.State run() {
    return (org.thingml.xthingmlmt.thingML.State) adaptersFactory.createAdapter(org.thingml.xthingml.aspects.StateAspect.run(adaptee), eResource);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__PROPERTIES:
    		return getProperties();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__ENTRY:
    		return getEntry();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__EXIT:
    		return getExit();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__INTERNAL:
    		return getInternal();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__OUTGOING:
    		return getOutgoing();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__PROPERTIES:
    		return getProperties() != null && !getProperties().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__ENTRY:
    		return getEntry() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__EXIT:
    		return getExit() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__INTERNAL:
    		return getInternal() != null && !getInternal().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__PROPERTIES:
    		getProperties().clear();
    		getProperties().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__ENTRY:
    		setEntry(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__EXIT:
    		setExit(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__INTERNAL:
    		getInternal().clear();
    		getInternal().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.AnnotatedElement.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__ANNOTATIONS:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.AnnotatedElement.class) {
    	switch (baseFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
