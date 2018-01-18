package tld.domain.project.theme.theme1.client.base.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritonPlainTabPanelAppearance extends Css3PlainTabPanelAppearance {

  public interface TritonPlainTabPanelResources extends Css3PlainTabPanelResources {

    @Override
    @Source({"Css3TabPanel.gss", "Css3PlainTabPanel.gss", "TritonPlainTabPanel.gss"})
    TritonPlainTabPanelStyle style();

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

  public interface TritonPlainTabPanelStyle extends Css3PlainTabPanelStyle {
  }

  public TritonPlainTabPanelAppearance() {
    super(GWT.<TritonPlainTabPanelResources> create(TritonPlainTabPanelResources.class));
  }
}
