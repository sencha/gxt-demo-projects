package tld.domain.project.client.application.widgets.windowwidget;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import tld.domain.project.client.application.widgets.windowwidget.WindowWidgetPresenter;
import tld.domain.project.client.application.widgets.windowwidget.WindowWidgetUiHandlers;
import tld.domain.project.client.application.widgets.windowwidget.WindowWidgetView;

public class WindowWidgetModule extends AbstractPresenterModule {

  @Override
  protected void configure() {
    bindSingletonPresenterWidget(WindowWidgetPresenter.class, WindowWidgetPresenter.MyView.class,
        WindowWidgetView.class);
    bind(WindowWidgetUiHandlers.class).to(WindowWidgetPresenter.class);
  }

}