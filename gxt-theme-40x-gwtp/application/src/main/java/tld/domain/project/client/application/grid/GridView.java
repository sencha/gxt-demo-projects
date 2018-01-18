package tld.domain.project.client.application.grid;

import javax.inject.Inject;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.TextField;

public class GridView extends ViewWithUiHandlers<GridUiHandlers> implements GridPresenter.MyView {

  interface Binder extends UiBinder<Widget, GridView> {
  }

  @Inject
  public GridView(Binder uiBinder) {
    initWidget(uiBinder.createAndBindUi(this));
  }


}
