/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sap.xsk.models.hdbdd.hdbDD.HdbDDPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class HdbDDStandaloneSetupGenerated implements ISetup {

  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    TerminalsStandaloneSetup.doSetup();

    Injector injector = createInjector();
    register(injector);
    return injector;
  }

  public Injector createInjector() {
    return Guice.createInjector(new HdbDDRuntimeModule());
  }

  public void register(Injector injector) {
    if (!EPackage.Registry.INSTANCE.containsKey("http://www.sap.com/xsk/models/hdbdd/HdbDD")) {
      EPackage.Registry.INSTANCE.put("http://www.sap.com/xsk/models/hdbdd/HdbDD", HdbDDPackage.eINSTANCE);
    }
    IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
    IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);

    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("hdbdd", resourceFactory);
    IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("hdbdd", serviceProvider);
  }
}
