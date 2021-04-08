/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.xsodata.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sap.xsk.models.xsodata.XSODataRuntimeModule;
import com.sap.xsk.models.xsodata.XSODataStandaloneSetup;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;

public class XSODataInjectorProvider implements IInjectorProvider, IRegistryConfigurator {

  static {
    GlobalRegistries.initializeDefaults();
  }

  protected GlobalStateMemento stateBeforeInjectorCreation;
  protected GlobalStateMemento stateAfterInjectorCreation;
  protected Injector injector;

  @Override
  public Injector getInjector() {
    if (injector == null) {
      this.injector = internalCreateInjector();
      stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
    }
    return injector;
  }

  protected Injector internalCreateInjector() {
    return new XSODataStandaloneSetup() {
      @Override
      public Injector createInjector() {
        return Guice.createInjector(createRuntimeModule());
      }
    }.createInjectorAndDoEMFRegistration();
  }

  protected XSODataRuntimeModule createRuntimeModule() {
    // make it work also with Maven/Tycho and OSGI
    // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=493672
    return new XSODataRuntimeModule() {
      @Override
      public ClassLoader bindClassLoaderToInstance() {
        return XSODataInjectorProvider.class
            .getClassLoader();
      }
    };
  }

  @Override
  public void restoreRegistry() {
    stateBeforeInjectorCreation.restoreGlobalState();
    stateBeforeInjectorCreation = null;
  }

  @Override
  public void setupRegistry() {
    stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
    if (injector == null) {
      getInjector();
    }
    stateAfterInjectorCreation.restoreGlobalState();
  }
}
