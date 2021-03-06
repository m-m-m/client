/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.widget;


/**
 * This is the interface for a {@link UiWidgetRegular regular} {@link UiWidgetComposite}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 * @param <CHILD> is the generic type of the {@link #getChild(int) children}.
 */
public abstract interface UiWidgetRegularComposite<CHILD extends UiWidget> extends UiWidgetComposite<CHILD>,
    UiWidgetRegular {

  // nothing to add...

}
