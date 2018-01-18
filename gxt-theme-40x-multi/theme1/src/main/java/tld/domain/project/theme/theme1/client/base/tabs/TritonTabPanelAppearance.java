package tld.domain.project.theme.theme1.client.base.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritonTabPanelAppearance extends Css3TabPanelAppearance {

  public interface TritonTabPanelResources extends Css3TabPanelResources {

    @Override
    @Source({"Css3TabPanel.gss", "TritonTabPanel.gss"})
    TritonTabPanelStyle style();

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

  public interface TritonTabPanelStyle extends Css3TabPanelStyle {
  }

  public TritonTabPanelAppearance() {
    super(GWT.<TritonTabPanelResources> create(TritonTabPanelResources.class));
  }
}
