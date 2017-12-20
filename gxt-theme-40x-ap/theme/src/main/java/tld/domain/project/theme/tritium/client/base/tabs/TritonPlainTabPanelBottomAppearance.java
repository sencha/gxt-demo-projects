package tld.domain.project.theme.tritium.client.base.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritonPlainTabPanelBottomAppearance extends Css3PlainTabPanelBottomAppearance {

  public interface TritonPlainTabPanelBottomResources extends Css3PlainTabPanelBottomResources {

    @Override
    @Source({"Css3TabPanelBottom.gss", "Css3PlainTabPanelBottom.gss", "TritonPlainTabPanelBottom.gss"})
    TritonPlainTabPanelBottomStyle style();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource plainTabClose();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource plainTabCloseOver();
  }

  public interface TritonPlainTabPanelBottomStyle extends Css3PlainTabPanelBottomStyle {
  }

  public TritonPlainTabPanelBottomAppearance() {
    super(GWT.<TritonPlainTabPanelBottomResources> create(TritonPlainTabPanelBottomResources.class));
  }
}
