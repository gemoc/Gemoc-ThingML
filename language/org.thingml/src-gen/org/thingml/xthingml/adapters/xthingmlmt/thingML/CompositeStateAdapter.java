package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.CompositeState;
import org.thingml.xthingmlmt.thingML.Action;
import org.thingml.xthingmlmt.thingML.InternalTransition;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.Property;
import org.thingml.xthingmlmt.thingML.Region;
import org.thingml.xthingmlmt.thingML.Session;
import org.thingml.xthingmlmt.thingML.State;
import org.thingml.xthingmlmt.thingML.Transition;

@SuppressWarnings("all")
public class CompositeStateAdapter extends EObjectAdapter<CompositeState> implements org.thingml.xthingmlmt.thingML.CompositeState {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public CompositeStateAdapter() {
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
  public State getInitial() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitial(), eResource);
  }
  
  @Override
  public void setInitial(final State o) {
    if (o != null)
    	adaptee.setInitial(((org.thingml.xthingml.adapters.xthingmlmt.thingML.StateAdapter) o).getAdaptee());
    else adaptee.setInitial(null);
  }
  
  private EList<State> substate_;
  
  @Override
  public EList<State> getSubstate() {
    if (substate_ == null)
    	substate_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubstate(), adaptersFactory, eResource);
    return substate_;
  }
  
  private EList<Region> region_;
  
  @Override
  public EList<Region> getRegion() {
    if (region_ == null)
    	region_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRegion(), adaptersFactory, eResource);
    return region_;
  }
  
  private EList<Session> session_;
  
  @Override
  public EList<Session> getSession() {
    if (session_ == null)
    	session_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSession(), adaptersFactory, eResource);
    return session_;
  }
  
  @Override
  public State getCurrentState() {
    return (State) adaptersFactory.createAdapter(org.thingml.xthingml.aspects.CompositeStateAspect.currentState(adaptee), eResource);
  }
  
  @Override
  public void setCurrentState(final State currentState) {
    org.thingml.xthingml.aspects.CompositeStateAspect.currentState(adaptee, (org.thingml.xthingml.thingML.State)((EObjectAdapter)currentState).getAdaptee()
    );
  }
  
  @Override
  public void initialize() {
    org.thingml.xthingml.aspects.CompositeStateAspect.initialize(adaptee);
  }
  
  @Override
  public State run() {
    return (State) adaptersFactory.createAdapter(org.thingml.xthingml.aspects.CompositeStateAspect.run(adaptee), eResource);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean HISTORY_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getCompositeState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__PROPERTIES:
    		return getProperties();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__ENTRY:
    		return getEntry();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__EXIT:
    		return getExit();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__INTERNAL:
    		return getInternal();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__OUTGOING:
    		return getOutgoing();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__INITIAL:
    		return getInitial();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__HISTORY:
    		return isHistory() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
    		return getSubstate();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__REGION:
    		return getRegion();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__SESSION:
    		return getSession();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__CURRENT_STATE:
    		return getCurrentState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__PROPERTIES:
    		return getProperties() != null && !getProperties().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__ENTRY:
    		return getEntry() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__EXIT:
    		return getExit() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__INTERNAL:
    		return getInternal() != null && !getInternal().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__INITIAL:
    		return getInitial() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__HISTORY:
    		return isHistory() != HISTORY_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
    		return getSubstate() != null && !getSubstate().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__REGION:
    		return getRegion() != null && !getRegion().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__SESSION:
    		return getSession() != null && !getSession().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__CURRENT_STATE:
    		return getCurrentState() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__PROPERTIES:
    		getProperties().clear();
    		getProperties().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__ENTRY:
    		setEntry(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__EXIT:
    		setExit(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__INTERNAL:
    		getInternal().clear();
    		getInternal().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__INITIAL:
    		setInitial(
    		(org.thingml.xthingmlmt.thingML.State)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__HISTORY:
    		setHistory(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
    		getSubstate().clear();
    		getSubstate().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__REGION:
    		getRegion().clear();
    		getRegion().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__SESSION:
    		getSession().clear();
    		getSession().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__CURRENT_STATE:
    		setCurrentState(
    		(org.thingml.xthingmlmt.thingML.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.StateContainer.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__INITIAL:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE_CONTAINER__INITIAL;
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__HISTORY:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE_CONTAINER__HISTORY;
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE_CONTAINER__SUBSTATE;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.StateContainer.class) {
    	switch (baseFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE_CONTAINER__INITIAL:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__INITIAL;
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE_CONTAINER__HISTORY:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__HISTORY;
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.STATE_CONTAINER__SUBSTATE:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.COMPOSITE_STATE__SUBSTATE;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
