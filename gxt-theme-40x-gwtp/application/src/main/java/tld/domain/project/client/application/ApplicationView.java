package tld.domain.project.client.application;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.container.Viewport;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {

  interface Binder extends UiBinder<Viewport, ApplicationView> {
  }

  @UiField
  ContentPanel main;

  @Inject
  public ApplicationView(Binder uiBinder) {
    initWidget(uiBinder.createAndBindUi(this));

    bindSlot(ApplicationPresenter.SLOT_MAIN, main);
  }

  @Override
  public void setInSlot(Object slot, IsWidget content) {
    if (slot.equals(ApplicationPresenter.SLOT_GXT_WINDOW)) {
      Window window = (Window) content.asWidget();
      window.show();
    } else {
      super.setInSlot(slot, content);
    }
  }
  
  @Override
  public void removeFromSlot(Object slot, IsWidget content) {
    if (slot.equals(ApplicationPresenter.SLOT_GXT_WINDOW)) {
      // ignore, nothing to do here, gxt window hides
    } else {
      super.setInSlot(slot, content);
    }
  }
  
}
