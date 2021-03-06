/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.attribute;

import net.sf.mmm.client.ui.api.handler.UiEventObserver;

/**
 * This interface gives read access to the {@link #getEventObserver() event observer} of an object.
 * 
 * @see UiEventObserver
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract interface AttributeReadEventObserver {

  /**
   * This method gets the {@link UiEventObserver}.
   * 
   * @return the {@link UiEventObserver}.
   */
  UiEventObserver getEventObserver();

}
