package tld.domain.project.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.themebuilder.base.client.config.FontDetails;
import com.sencha.gxt.themebuilder.base.client.config.ThemeDetails;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutData;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.HBoxLayoutAlign;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;

import tld.domain.project.client.ClientFactory;

public class ApplicationLayout implements IsWidget {

  private ClientFactory clientFactory;

  private SimpleContainer header;

  private SimpleContainer contentPanel;

  private SimpleContainer footer;

  private VerticalLayoutContainer widget;

  public ApplicationLayout(ClientFactory clientFactory) {
    this.clientFactory = clientFactory;
  }

  public void setClientFactory(ClientFactory clientFactory) {
    this.clientFactory = clientFactory;
  }

  @Override
  public Widget asWidget() {
    if (widget == null) {
      header = new SimpleContainer();
      header.add(createHeader());

      contentPanel = new SimpleContainer() {
        @Override
        public void setWidget(IsWidget w) {
          super.setWidget(w);

          // When content changes in a top level down sizing layout, tell the children to resize
          forceLayout();
        }
      };

      footer = new SimpleContainer();
      footer.add(createFooter());

      widget = new VerticalLayoutContainer();
      widget.add(header, new VerticalLayoutData(1, 50));
      widget.add(contentPanel, new VerticalLayoutData(1, 1));
      widget.add(footer, new VerticalLayoutData(1, 75));
      
      // Set the content panel, for navigation
      clientFactory.getActivityManager().setDisplay(contentPanel);
      
      // set the global font-family from the theme
      widget.getElement().getStyle().setProperty("fontFamily", getThemeFontFamily());
    }
    
    // navigate to the current history token
    clientFactory.handleCurrentHistory();

    return widget;
  }
  
  /**
   * Returns the theme font family. 
   * 
   * @return the theme font family 
   */
  private String getThemeFontFamily() {
    ThemeDetails themeDetails = GWT.create(ThemeDetails.class);
    FontDetails fontDetails = themeDetails.panel().font();
    String family = fontDetails.family();
    return family;
  }

  private Widget createHeader() {
    Anchor anchorHome = new Anchor("Home", "#home:");
    Anchor anchorLogin = new Anchor("Login", "#login:");

    BoxLayoutData layoutData = new BoxLayoutData();
    layoutData.setMargins(new Margins(0, 10, 0, 10));
    
    BoxLayoutData flex = new BoxLayoutData();
    flex.setFlex(1);
    
    HBoxLayoutContainer header = new HBoxLayoutContainer(HBoxLayoutAlign.MIDDLE);
    header.add(new HTML("Company"), layoutData);
    header.add(anchorHome);
    header.add(new SimpleContainer(), flex); // align next item to the right
    header.add(anchorLogin, layoutData); 

    return header;
  }

  private Widget createFooter() {
    Anchor anchorSencha = new Anchor("Sencha.com", "http://sencha.com");
    Anchor anchorGuides = new Anchor("GXT 4.0 Guides", "http://docs-devel.sencha.com/gxt/4.x/");
    
    BoxLayoutData layoutData = new BoxLayoutData();
    layoutData.setMargins(new Margins(0, 0, 0, 10));
    
    BoxLayoutData flex = new BoxLayoutData();
    flex.setFlex(1);
    
    HBoxLayoutContainer footer = new HBoxLayoutContainer(HBoxLayoutAlign.MIDDLE);
    footer.add(anchorSencha, layoutData);
    footer.add(anchorGuides, layoutData);
    footer.add(new SimpleContainer(), flex);
    
    return footer;
  }
  
}
