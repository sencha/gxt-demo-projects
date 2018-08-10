package tld.domain.project.theme.tritium.client.base.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritiumTabPanelBottomAppearance extends Css3TabPanelBottomAppearance {

  public interface TritiumTabPanelBottomResources extends Css3TabPanelBottomResources {

    @Override
    @Source({"Css3TabPanelBottom.gss", "TritiumTabPanelBottom.gss"})
    TritiumTabPanelBottomStyle style();

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

  public interface TritiumTabPanelBottomStyle extends Css3TabPanelBottomStyle {
  }

  public TritiumTabPanelBottomAppearance() {
    super(GWT.<TritiumTabPanelBottomResources> create(TritiumTabPanelBottomResources.class));
  }
}
