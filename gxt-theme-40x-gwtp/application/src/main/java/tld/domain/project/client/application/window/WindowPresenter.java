package tld.domain.project.client.application.window;

import com.google.gwt.core.client.GWT;
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
import tld.domain.project.client.place.NameTokens;
import tld.domain.project.client.place.ParameterTokens;

/**
 * Using a place to show a a window.
 */
public class WindowPresenter extends Presenter<WindowPresenter.MyView, WindowPresenter.MyProxy>
    implements WindowUiHandlers {

  interface MyView extends View, HasUiHandlers<WindowUiHandlers> {

    void setName(String name);

  }

  @NameToken(NameTokens.Window)
  @ProxyStandard
  interface MyProxy extends ProxyPlace<WindowPresenter> {
  }

  private PlaceManager placeManager;
  private String onHide;
  private String name;

  @Inject
  public WindowPresenter(EventBus eventBus, MyView view, MyProxy proxy, PlaceManager placeManager) {
    super(eventBus, view, proxy, ApplicationPresenter.SLOT_GXT_WINDOW);

    this.placeManager = placeManager;
    
    getView().setUiHandlers(this);
  }
  
  @Override
  public void prepareFromRequest(PlaceRequest request) {
      onHide = request.getParameter(ParameterTokens.onHide, NameTokens.Home);
      name = request.getParameter(ParameterTokens.name, "Nothing Entered For Name");
      
      getView().setName(name);
  }
  
  @Override
  protected void onReveal() {
    super.onReveal();
  }
  
  @Override
  protected void onReset() {
    super.onReset();
  }

  @Override
  public void onHide() {    
    try {
    this.removeFromParentSlot();
    } catch(Exception e) {
      GWT.log("IGNORE EXCEPTION Window removed");
    }
    
    PlaceRequest placeRequest = new PlaceRequest.Builder().nameToken(onHide).build();

    placeManager.revealPlace(placeRequest);
  }
  
}
