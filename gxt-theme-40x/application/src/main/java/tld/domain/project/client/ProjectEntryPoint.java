package tld.domain.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.cell.core.client.TextButtonCell;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

import tld.domain.project.theme.tritium.custom.client.button.purple.PurpleButtonCellAppearance;
import tld.domain.project.theme.tritium.custom.client.button.red.RedButtonCellAppearance;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
    // Default Button
    String version = GXT.getVersion().getRelease();
    TextButton textButton = new TextButton("Verify GXT Works: Version=" + version);
    textButton.addSelectHandler(new SelectHandler() {
      @Override
      public void onSelect(SelectEvent event) {
        MessageBox messageBox = new MessageBox("GXT Works.");
        messageBox.show();
      }
    });
    
    // Red Button
    TextButtonCell redCell = new TextButtonCell(new RedButtonCellAppearance<>());
    TextButton redButton = new TextButton(redCell);
    redButton.setText("Red Button");
    
    // Purple Button
    TextButtonCell purpleCell = new TextButtonCell(new PurpleButtonCellAppearance<>());
    TextButton purpleButton = new TextButton(purpleCell);
    purpleButton.setText("Purple Button");
    
    // Layout
    VerticalLayoutContainer vlc = new VerticalLayoutContainer();
    vlc.add(textButton);
    vlc.add(redButton);
    vlc.add(purpleButton);
   
    Viewport vp = new Viewport();
    vp.add(vlc);
    
    RootPanel.get().add(vp);
  }
  
}
