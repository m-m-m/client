/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget.factory;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.field.UiWidgetField;
import net.sf.mmm.client.ui.api.widget.field.UiWidgetTextField;

/**
 * This is the implementation of {@link net.sf.mmm.client.ui.api.widget.factory.UiSingleWidgetFactoryDatatype}
 * for the datatype {@link String}.
 *
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiSingleWidgetFactoryDatatypeString extends AbstractUiSingleWidgetFactoryDatatype<String> {

  /**
   * The constructor.
   */
  public UiSingleWidgetFactoryDatatypeString() {

    super(String.class);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UiWidgetField<String> create(UiContext context) {

    return context.getWidgetFactory().create(UiWidgetTextField.class);
  }
}
