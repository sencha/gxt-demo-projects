package tld.domain.project.theme.tritium.custom.client.slider;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

import tld.domain.project.theme.tritium.client.base.slider.Css3HorizontalSliderAppearance;

public class TritiumHorizontalSliderAppearance extends Css3HorizontalSliderAppearance {

  public interface TritiumHorizontalSliderResources extends Css3HorizontalSliderResources {

    @Source({"tld/domain/project/theme/tritium/client/base/slider/Css3HorizontalSlider.gss",
            "TritiumSlider.gss", "TritiumHorizontalSlider.gss"})
    TritiumHorizontalSliderStyle style();

    @ImageOptions(width = 20, height = 20)
    ImageResource sliderThumbHorizontal();
  }

  public interface TritiumHorizontalSliderStyle extends Css3HorizontalSliderStyle {
  }

  public TritiumHorizontalSliderAppearance() {
    this(GWT.<TritiumHorizontalSliderResources> create(TritiumHorizontalSliderResources.class));
  }

  public TritiumHorizontalSliderAppearance(Css3HorizontalSliderResources resources) {
    super(resources);
  }
}
