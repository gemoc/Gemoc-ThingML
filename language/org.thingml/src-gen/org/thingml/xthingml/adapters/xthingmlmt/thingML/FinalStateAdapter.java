package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.FinalState;
import org.thingml.xthingmlmt.thingML.Action;
import org.thingml.xthingmlmt.thingML.InternalTransition;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.Property;
import org.thingml.xthingmlmt.thingML.State;
import org.thingml.xthingmlmt.thingML.Transition;

@SuppressWarnings("all")
public class FinalStateAdapter extends EObjectAdapter<FinalState> implements org.thingml.xthingmlmt.thingML.FinalState {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public FinalStateAdapter() {
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
  public State run() {
    return (State) adaptersFactory.createAdapter(org.thingml.xthingml.aspects.StateAspect.run(adaptee), eResource);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getFinalState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__PROPERTIES:
    		return getProperties();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__ENTRY:
    		return getEntry();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__EXIT:
    		return getExit();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__INTERNAL:
    		return getInternal();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__OUTGOING:
    		return getOutgoing();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__PROPERTIES:
    		return getProperties() != null && !getProperties().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__ENTRY:
    		return getEntry() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__EXIT:
    		return getExit() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__INTERNAL:
    		return getInternal() != null && !getInternal().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__PROPERTIES:
    		getProperties().clear();
    		getProperties().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__ENTRY:
    		setEntry(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__EXIT:
    		setExit(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__INTERNAL:
    		getInternal().clear();
    		getInternal().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FINAL_STATE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
