package tld.domain.project.client.application.widgets;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import tld.domain.project.client.application.widgets.windowwidget.WindowWidgetModule;

public class WidgetsModule extends AbstractPresenterModule {

  @Override
  protected void configure() {
    install(new WindowWidgetModule());
  }

}