package tld.domain.project.client.application.window;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.event.HideEvent;
import com.sencha.gxt.widget.core.client.event.HideEvent.HideHandler;

public class WindowView extends ViewWithUiHandlers<WindowUiHandlers> implements WindowPresenter.MyView {

  interface Binder extends UiBinder<Window, WindowView> {
  }

  private Window window;
  
  @UiField
  Label name;

  @Inject
  public WindowView(Binder uiBinder) {
    window = uiBinder.createAndBindUi(this);
    initWidget(window);
    
    window.addHideHandler(new HideHandler() {
      @Override
      public void onHide(HideEvent event) {
        getUiHandlers().onHide();
      }
    });
  }

  @Override
  public void setName(String name) {
    this.name.setText(name);
  }

}
