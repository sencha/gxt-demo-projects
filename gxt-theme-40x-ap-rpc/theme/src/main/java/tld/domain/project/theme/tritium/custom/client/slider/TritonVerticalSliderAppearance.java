package tld.domain.project.theme.tritium.custom.client.slider;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

import tld.domain.project.theme.tritium.client.base.slider.Css3VerticalSliderAppearance;

public class TritonVerticalSliderAppearance extends Css3VerticalSliderAppearance {

  public interface TritonVerticalSliderResources extends Css3VerticalSliderResources {

    @Source({"tld/domain/project/theme/tritium/client/base/slider/Css3HorizontalSlider.gss",
            "tld/domain/project/theme/tritium/client/base/slider/Css3VerticalSlider.gss",
            "TritonSlider.gss", 
            "TritonVerticalSlider.gss"})
    TritonVerticalSliderStyle style();

    @ImageOptions(height = 20, width = 20)
    ImageResource sliderThumbVertical();
  }

  public interface TritonVerticalSliderStyle extends Css3VerticalSliderStyle {
  }

  public TritonVerticalSliderAppearance() {
    this(GWT.<TritonVerticalSliderResources> create(TritonVerticalSliderResources.class));
  }

  public TritonVerticalSliderAppearance(TritonVerticalSliderResources resources) {
    super(resources);
  }
}
