package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Port;
import org.thingml.xthingmlmt.thingML.Message;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;

@SuppressWarnings("all")
public class PortAdapter extends EObjectAdapter<Port> implements org.thingml.xthingmlmt.thingML.Port {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public PortAdapter() {
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
  
  private EList<Message> sends_;
  
  @Override
  public EList<Message> getSends() {
    if (sends_ == null)
    	sends_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSends(), adaptersFactory, eResource);
    return sends_;
  }
  
  private EList<Message> receives_;
  
  @Override
  public EList<Message> getReceives() {
    if (receives_ == null)
    	receives_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getReceives(), adaptersFactory, eResource);
    return receives_;
  }
  
  @Override
  public boolean hasReceived(final Message message) {
    return org.thingml.xthingml.aspects.PortAspect.hasReceived(adaptee, (org.thingml.xthingml.thingML.Message)((EObjectAdapter)message).getAdaptee()
    );
  }
  
  @Override
  public EList<Message> getMessages() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(org.thingml.xthingml.aspects.PortAspect.messages(adaptee), adaptersFactory, eResource);
  }
  
  @Override
  public void sends(final Message message) {
    org.thingml.xthingml.aspects.PortAspect.sends(adaptee, (org.thingml.xthingml.thingML.Message)((EObjectAdapter)message).getAdaptee()
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__SENDS:
    		return getSends();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__RECEIVES:
    		return getReceives();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__MESSAGES:
    		return getMessages();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__SENDS:
    		return getSends() != null && !getSends().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__RECEIVES:
    		return getReceives() != null && !getReceives().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__MESSAGES:
    		return getMessages() != null && !getMessages().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__SENDS:
    		getSends().clear();
    		getSends().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__RECEIVES:
    		getReceives().clear();
    		getReceives().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__MESSAGES:
    		getMessages().clear();
    		getMessages().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.AnnotatedElement.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__ANNOTATIONS:
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
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.PORT__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
