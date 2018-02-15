package org.thingml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.thingml.xthingml.thingML.ThingMLPackage.eNS_URI,
    	org.thingml.xthingml.thingML.ThingMLPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.thingml.xtext.thingML.ThingMLPackage.eNS_URI,
    	org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xThingML = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.thingml.XThingML", "", "http://org.thingml.xthingml/thingML/", "org.thingml.XThingMLMT"
    );
    xThingML.addAdapter("org.thingml.XThingMLMT", org.thingml.xthingml.adapters.xthingmlmt.XThingMLAdapter.class);
    xThingML.addAdapter("org.thingml.ThingMLMT", org.thingml.xthingml.adapters.thingmlmt.XThingMLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.thingml.XThingML",
    	xThingML
    );
    MelangeRegistry.LanguageDescriptor thingML = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.thingml.ThingML", "", "http://www.thingml.org/xtext/ThingML", "org.thingml.ThingMLMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.thingml.ThingML",
    	thingML
    );
    MelangeRegistry.ModelTypeDescriptor xThingMLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.thingml.XThingMLMT", "", "http://org.thingml.xthingmlmt/"
    );
    xThingMLMT.addSuperType("org.thingml.ThingMLMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.thingml.XThingMLMT",
    	xThingMLMT
    );
    MelangeRegistry.ModelTypeDescriptor thingMLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.thingml.ThingMLMT", "", "http://org.thingml.thingmlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.thingml.ThingMLMT",
    	thingMLMT
    );
  }
}
