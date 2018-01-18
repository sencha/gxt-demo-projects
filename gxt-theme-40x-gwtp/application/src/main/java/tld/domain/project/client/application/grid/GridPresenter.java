package tld.domain.project.client.application.grid;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import tld.domain.project.client.application.ApplicationPresenter;
import tld.domain.project.client.place.NameTokens;

public class GridPresenter extends Presenter<GridPresenter.MyView, GridPresenter.MyProxy> implements GridUiHandlers {

  interface MyView extends View, HasUiHandlers<GridUiHandlers> {
  }

  @NameToken(NameTokens.Grid)
  @ProxyStandard
  interface MyProxy extends ProxyPlace<GridPresenter> {
  }

  @Inject
  public GridPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
    super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);

    getView().setUiHandlers(this);
  }

}
