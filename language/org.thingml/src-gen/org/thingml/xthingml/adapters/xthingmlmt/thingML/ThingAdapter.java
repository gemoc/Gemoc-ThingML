package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Thing;
import org.thingml.xthingmlmt.thingML.CompositeState;
import org.thingml.xthingmlmt.thingML.Function;
import org.thingml.xthingmlmt.thingML.Message;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.Port;
import org.thingml.xthingmlmt.thingML.Property;
import org.thingml.xthingmlmt.thingML.PropertyAssign;

@SuppressWarnings("all")
public class ThingAdapter extends EObjectAdapter<Thing> implements org.thingml.xthingmlmt.thingML.Thing {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ThingAdapter() {
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
  public boolean isFragment() {
    return adaptee.isFragment();
  }
  
  @Override
  public void setFragment(final boolean o) {
    adaptee.setFragment(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  private EList<org.thingml.xthingmlmt.thingML.Thing> includes_;
  
  @Override
  public EList<org.thingml.xthingmlmt.thingML.Thing> getIncludes() {
    if (includes_ == null)
    	includes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncludes(), adaptersFactory, eResource);
    return includes_;
  }
  
  private EList<Message> messages_;
  
  @Override
  public EList<Message> getMessages() {
    if (messages_ == null)
    	messages_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMessages(), adaptersFactory, eResource);
    return messages_;
  }
  
  private EList<Port> ports_;
  
  @Override
  public EList<Port> getPorts() {
    if (ports_ == null)
    	ports_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPorts(), adaptersFactory, eResource);
    return ports_;
  }
  
  private EList<Property> properties_;
  
  @Override
  public EList<Property> getProperties() {
    if (properties_ == null)
    	properties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProperties(), adaptersFactory, eResource);
    return properties_;
  }
  
  private EList<Function> functions_;
  
  @Override
  public EList<Function> getFunctions() {
    if (functions_ == null)
    	functions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFunctions(), adaptersFactory, eResource);
    return functions_;
  }
  
  private EList<PropertyAssign> assign_;
  
  @Override
  public EList<PropertyAssign> getAssign() {
    if (assign_ == null)
    	assign_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAssign(), adaptersFactory, eResource);
    return assign_;
  }
  
  @Override
  public CompositeState getBehaviour() {
    return (CompositeState) adaptersFactory.createAdapter(adaptee.getBehaviour(), eResource);
  }
  
  @Override
  public void setBehaviour(final CompositeState o) {
    if (o != null)
    	adaptee.setBehaviour(((org.thingml.xthingml.adapters.xthingmlmt.thingML.CompositeStateAdapter) o).getAdaptee());
    else adaptee.setBehaviour(null);
  }
  
  @Override
  public void main() {
    org.thingml.xthingml.aspects.ThingAspect.main(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean FRAGMENT_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getThing();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__FRAGMENT:
    		return isFragment() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__INCLUDES:
    		return getIncludes();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__MESSAGES:
    		return getMessages();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__PORTS:
    		return getPorts();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__PROPERTIES:
    		return getProperties();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__FUNCTIONS:
    		return getFunctions();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__ASSIGN:
    		return getAssign();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__BEHAVIOUR:
    		return getBehaviour();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__FRAGMENT:
    		return isFragment() != FRAGMENT_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__INCLUDES:
    		return getIncludes() != null && !getIncludes().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__MESSAGES:
    		return getMessages() != null && !getMessages().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__PORTS:
    		return getPorts() != null && !getPorts().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__PROPERTIES:
    		return getProperties() != null && !getProperties().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__FUNCTIONS:
    		return getFunctions() != null && !getFunctions().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__ASSIGN:
    		return getAssign() != null && !getAssign().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__BEHAVIOUR:
    		return getBehaviour() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__FRAGMENT:
    		setFragment(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__INCLUDES:
    		getIncludes().clear();
    		getIncludes().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__MESSAGES:
    		getMessages().clear();
    		getMessages().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__PORTS:
    		getPorts().clear();
    		getPorts().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__PROPERTIES:
    		getProperties().clear();
    		getProperties().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__FUNCTIONS:
    		getFunctions().clear();
    		getFunctions().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__ASSIGN:
    		getAssign().clear();
    		getAssign().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING__BEHAVIOUR:
    		setBehaviour(
    		(org.thingml.xthingmlmt.thingML.CompositeState)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
