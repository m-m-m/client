/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget.window.adapter;

import net.sf.mmm.client.ui.api.attribute.AttributeReadResizable;
import net.sf.mmm.client.ui.api.attribute.AttributeWritePosition;
import net.sf.mmm.client.ui.api.attribute.AttributeWriteStringTitle;
import net.sf.mmm.client.ui.api.widget.UiWidgetRegular;
import net.sf.mmm.client.ui.base.widget.adapter.UiWidgetAdapterDynamicComposite;

/**
 * This is the interface for a {@link net.sf.mmm.client.ui.base.widget.adapter.UiWidgetAdapter} adapting
 * {@link net.sf.mmm.client.ui.api.widget.window.UiWidgetAbstractWindow}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public interface UiWidgetAdapterAbstractWindow extends UiWidgetAdapterDynamicComposite<UiWidgetRegular>,
    AttributeWritePosition, AttributeWriteStringTitle, AttributeReadResizable {

  // nothing to add

}
