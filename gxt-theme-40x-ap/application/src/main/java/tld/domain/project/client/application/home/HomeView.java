package tld.domain.project.client.application.home;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;

import tld.domain.project.client.application.Presenter;

public class HomeView implements IsWidget {

  private Presenter presenter;

  private VerticalLayoutContainer widget;

  public void setPresenter(Presenter presenter) {
    this.presenter = presenter;
  }

  public void start() {

  }

  @Override
  public Widget asWidget() {
    if (widget == null) {
      widget = new VerticalLayoutContainer();

      widget.add(new HTML("Home"), new VerticalLayoutData(1, 1));
    }

    return widget;
  }

}
