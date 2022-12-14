/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://calypsonet.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.calypsonet.keyple.plugin.hsm.spirtech;

/**
 * Spirtech HSM plugin factory provider.
 *
 * @since 2.0.0
 */
public final class SpirtechHsmPluginFactoryProvider {

  /**
   * Returns the factory to register to the Keyple core service.
   *
   * @return A new instance.
   * @since 2.0.0
   */
  public static SpirtechHsmPluginFactory getFactory() {
    return new SpirtechHsmPluginFactoryAdapter();
  }
}
