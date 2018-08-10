package tld.domain.project.theme.tritium.client.base.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritiumPlainTabPanelAppearance extends Css3PlainTabPanelAppearance {

  public interface TritiumPlainTabPanelResources extends Css3PlainTabPanelResources {

    @Override
    @Source({"Css3TabPanel.gss", "Css3PlainTabPanel.gss", "TritiumPlainTabPanel.gss"})
    TritiumPlainTabPanelStyle style();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource activePlainTabClose();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource activePlainTabCloseOver();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource plainTabClose();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource plainTabCloseOver();
  }

  public interface TritiumPlainTabPanelStyle extends Css3PlainTabPanelStyle {
  }

  public TritiumPlainTabPanelAppearance() {
    super(GWT.<TritiumPlainTabPanelResources> create(TritiumPlainTabPanelResources.class));
  }
}
