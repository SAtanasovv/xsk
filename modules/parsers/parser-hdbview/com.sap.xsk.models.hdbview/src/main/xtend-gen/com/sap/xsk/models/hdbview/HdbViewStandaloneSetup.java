/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbview;

import com.sap.xsk.models.hdbview.HdbViewStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class HdbViewStandaloneSetup extends HdbViewStandaloneSetupGenerated {
  public static void doSetup() {
    new HdbViewStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
