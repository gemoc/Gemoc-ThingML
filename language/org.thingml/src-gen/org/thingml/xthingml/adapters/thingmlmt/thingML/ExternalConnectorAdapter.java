package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.Protocol;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ExternalConnector;

@SuppressWarnings("all")
public class ExternalConnectorAdapter extends EObjectAdapter<ExternalConnector> implements org.thingml.xtext.thingML.ExternalConnector {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public ExternalConnectorAdapter() {
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
  public Instance getInst() {
    return (Instance) adaptersFactory.createAdapter(adaptee.getInst(), eResource);
  }
  
  @Override
  public void setInst(final Instance o) {
    if (o != null)
    	adaptee.setInst(((org.thingml.xthingml.adapters.thingmlmt.thingML.InstanceAdapter) o).getAdaptee());
    else adaptee.setInst(null);
  }
  
  @Override
  public Port getPort() {
    return (Port) adaptersFactory.createAdapter(adaptee.getPort(), eResource);
  }
  
  @Override
  public void setPort(final Port o) {
    if (o != null)
    	adaptee.setPort(((org.thingml.xthingml.adapters.thingmlmt.thingML.PortAdapter) o).getAdaptee());
    else adaptee.setPort(null);
  }
  
  @Override
  public Protocol getProtocol() {
    return (Protocol) adaptersFactory.createAdapter(adaptee.getProtocol(), eResource);
  }
  
  @Override
  public void setProtocol(final Protocol o) {
    if (o != null)
    	adaptee.setProtocol(((org.thingml.xthingml.adapters.thingmlmt.thingML.ProtocolAdapter) o).getAdaptee());
    else adaptee.setProtocol(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getExternalConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__INST:
    		return getInst();
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__PORT:
    		return getPort();
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__PROTOCOL:
    		return getProtocol();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__INST:
    		return getInst() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__PORT:
    		return getPort() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__PROTOCOL:
    		return getProtocol() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__INST:
    		setInst(
    		(org.thingml.xtext.thingML.Instance)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__PORT:
    		setPort(
    		(org.thingml.xtext.thingML.Port)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERNAL_CONNECTOR__PROTOCOL:
    		setProtocol(
    		(org.thingml.xtext.thingML.Protocol)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
