package tld.domain.project.theme.tritium.client.base.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritiumTabPanelAppearance extends Css3TabPanelAppearance {

  public interface TritiumTabPanelResources extends Css3TabPanelResources {

    @Override
    @Source({"Css3TabPanel.gss", "TritiumTabPanel.gss"})
    TritiumTabPanelStyle style();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource activeTabClose();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource activeTabCloseOver();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource tabClose();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource tabCloseOver();
  }

  public interface TritiumTabPanelStyle extends Css3TabPanelStyle {
  }

  public TritiumTabPanelAppearance() {
    super(GWT.<TritiumTabPanelResources> create(TritiumTabPanelResources.class));
  }
}
