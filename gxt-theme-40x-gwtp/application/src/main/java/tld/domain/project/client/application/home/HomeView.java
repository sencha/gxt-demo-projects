package tld.domain.project.client.application.home;

import javax.inject.Inject;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.TextField;

public class HomeView extends ViewWithUiHandlers<HomeUiHandlers> implements HomePresenter.MyView {

  interface Binder extends UiBinder<Widget, HomeView> {
  }

  @UiField
  TextField name;

  @Inject
  public HomeView(Binder uiBinder) {
    initWidget(uiBinder.createAndBindUi(this));
  }

  @UiHandler("buttonOpenWindowPresenter")
  public void onOpenWindowPresenter(SelectEvent event) {
    GWT.log("buttonOpenWindowPresenter selected");

    getUiHandlers().onOpenWindowPresenter(getName());
  }

  @UiHandler("buttonOpenWindowWidget")
  public void onOpenWindowWidget(SelectEvent event) {
    GWT.log("buttonOpenWindowWidget selected");

    getUiHandlers().onOpenWindowWidget(getName());
  }

  @UiHandler("buttonOpenGrid")
  public void onOpenGrid(SelectEvent event) {
    getUiHandlers().onOpenGrid();
  }

  private String getName() {
    // Have the presenter take over
    String name = this.name.getCurrentValue();
    if (name == null || name.isEmpty()) {
      name = "Nothing Entered into the TextField";
    }
    return name;
  }

}
