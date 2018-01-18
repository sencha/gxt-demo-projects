package tld.domain.project.client.application.widgets.windowwidget;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;

public class WindowWidgetPresenter extends PresenterWidget<WindowWidgetPresenter.MyView> implements WindowWidgetUiHandlers {

  public interface MyView extends View {

    void setName(String name);

    void show();
    
  }

  @Inject
  public WindowWidgetPresenter(EventBus eventBus, MyView view) {
    super(eventBus, view);
  }

  public void show(String name) {
    getView().setName(name);
    getView().show();
  }

}