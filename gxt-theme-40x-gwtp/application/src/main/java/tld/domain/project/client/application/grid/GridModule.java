package tld.domain.project.client.application.grid;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class GridModule extends AbstractPresenterModule {

  @Override
  protected void configure() {
    bindPresenter(GridPresenter.class, GridPresenter.MyView.class, GridView.class, GridPresenter.MyProxy.class);
  }

}
