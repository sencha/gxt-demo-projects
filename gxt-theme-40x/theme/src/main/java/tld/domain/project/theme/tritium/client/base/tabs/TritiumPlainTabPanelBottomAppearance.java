package tld.domain.project.theme.tritium.client.base.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritiumPlainTabPanelBottomAppearance extends Css3PlainTabPanelBottomAppearance {

  public interface TritiumPlainTabPanelBottomResources extends Css3PlainTabPanelBottomResources {

    @Override
    @Source({"Css3TabPanelBottom.gss", "Css3PlainTabPanelBottom.gss", "TritiumPlainTabPanelBottom.gss"})
    TritiumPlainTabPanelBottomStyle style();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource plainTabClose();

    @Override
    @ImageOptions(height = 16, width = 16)
    ImageResource plainTabCloseOver();
  }

  public interface TritiumPlainTabPanelBottomStyle extends Css3PlainTabPanelBottomStyle {
  }

  public TritiumPlainTabPanelBottomAppearance() {
    super(GWT.<TritiumPlainTabPanelBottomResources> create(TritiumPlainTabPanelBottomResources.class));
  }
}
