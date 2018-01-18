package tld.domain.project.client.application.home;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import tld.domain.project.client.application.ApplicationPresenter;
import tld.domain.project.client.application.widgets.windowwidget.WindowWidgetPresenter;
import tld.domain.project.client.place.NameTokens;
import tld.domain.project.client.place.ParameterTokens;

public class HomePresenter extends Presenter<HomePresenter.MyView, HomePresenter.MyProxy> implements HomeUiHandlers {

  interface MyView extends View, HasUiHandlers<HomeUiHandlers> {
  }

  @NameToken(NameTokens.Home)
  @ProxyStandard
  interface MyProxy extends ProxyPlace<HomePresenter> {
  }

  private PlaceManager placeManager;
  private WindowWidgetPresenter windowWidgetPresenter;

  @Inject
  public HomePresenter(EventBus eventBus, MyView view, MyProxy proxy, PlaceManager placeManager, 
      WindowWidgetPresenter windowWidgetPresenter) {
    super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);

    this.placeManager = placeManager;
    this.windowWidgetPresenter = windowWidgetPresenter;

    getView().setUiHandlers(this);
  }

  @Override
  public void onOpenWindowPresenter(String name) {
    displayWindowPresenter(name);
  }
  
  @Override
  public void onOpenWindowWidget(String name) {
    windowWidgetPresenter.show(name);
  }

  @Override
  public void onOpenGrid() {
    displayGrid();
  }

  private void displayGrid() {
    PlaceRequest placeRequest = new PlaceRequest.Builder().nameToken(NameTokens.Grid).build();
    placeManager.revealPlace(placeRequest);
  }

  private void displayWindowPresenter(String name) {
    PlaceRequest placeRequest = new PlaceRequest.Builder().nameToken(NameTokens.Window).with(ParameterTokens.name, name)
        .with(ParameterTokens.onHide, NameTokens.Home).build();
    placeManager.revealPlace(placeRequest);
  }

}
