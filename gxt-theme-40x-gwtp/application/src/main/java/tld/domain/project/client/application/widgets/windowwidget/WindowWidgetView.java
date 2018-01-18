package tld.domain.project.client.application.widgets.windowwidget;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.sencha.gxt.widget.core.client.Window;

public class WindowWidgetView extends ViewImpl implements WindowWidgetPresenter.MyView {

  interface Binder extends UiBinder<Window, WindowWidgetView> {
  }

  @UiField
  Window window;

  @UiField
  Label name;

  @Inject
  public WindowWidgetView(Binder binder) {
    initWidget(binder.createAndBindUi(this));
  }

  @Override
  public void setName(String name) {
    this.name.setText(name);
  }

  @Override
  public void show() {
    window.show();
  }

}