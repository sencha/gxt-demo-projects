package tld.domain.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.container.Viewport;

import tld.domain.project.client.application.ApplicationLayout;

public class ProjectEntryPoint implements EntryPoint {

  private ClientFactory clientFactory;
  
  @Override
  public void onModuleLoad() {
    clientFactory = new ClientFactory();
    
    Viewport viewport = new Viewport();
    viewport.add(new ApplicationLayout(clientFactory));

    RootPanel.get().add(viewport);
  }
  
}
