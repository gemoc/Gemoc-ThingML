package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ThingMLModel;
import org.thingml.xthingmlmt.thingML.Configuration;
import org.thingml.xthingmlmt.thingML.Import;
import org.thingml.xthingmlmt.thingML.Protocol;
import org.thingml.xthingmlmt.thingML.Type;

@SuppressWarnings("all")
public class ThingMLModelAdapter extends EObjectAdapter<ThingMLModel> implements org.thingml.xthingmlmt.thingML.ThingMLModel {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ThingMLModelAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  private EList<Import> imports_;
  
  @Override
  public EList<Import> getImports() {
    if (imports_ == null)
    	imports_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getImports(), adaptersFactory, eResource);
    return imports_;
  }
  
  private EList<Type> types_;
  
  @Override
  public EList<Type> getTypes() {
    if (types_ == null)
    	types_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTypes(), adaptersFactory, eResource);
    return types_;
  }
  
  private EList<Protocol> protocols_;
  
  @Override
  public EList<Protocol> getProtocols() {
    if (protocols_ == null)
    	protocols_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProtocols(), adaptersFactory, eResource);
    return protocols_;
  }
  
  private EList<Configuration> configs_;
  
  @Override
  public EList<Configuration> getConfigs() {
    if (configs_ == null)
    	configs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConfigs(), adaptersFactory, eResource);
    return configs_;
  }
  
  @Override
  public void initialize(final org.eclipse.emf.common.util.EList<java.lang.String> p) {
    org.thingml.xthingml.aspects.ThingMLModelAspect.initialize(adaptee, p
    );
  }
  
  @Override
  public void main() {
    org.thingml.xthingml.aspects.ThingMLModelAspect.main(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getThingMLModel();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__IMPORTS:
    		return getImports();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__TYPES:
    		return getTypes();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__PROTOCOLS:
    		return getProtocols();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__CONFIGS:
    		return getConfigs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__IMPORTS:
    		return getImports() != null && !getImports().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__TYPES:
    		return getTypes() != null && !getTypes().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__PROTOCOLS:
    		return getProtocols() != null && !getProtocols().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__CONFIGS:
    		return getConfigs() != null && !getConfigs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__IMPORTS:
    		getImports().clear();
    		getImports().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__TYPES:
    		getTypes().clear();
    		getTypes().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__PROTOCOLS:
    		getProtocols().clear();
    		getProtocols().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.THING_ML_MODEL__CONFIGS:
    		getConfigs().clear();
    		getConfigs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
