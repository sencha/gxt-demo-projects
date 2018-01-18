package tld.domain.project.theme.tritium.custom.client.button;


import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

import tld.domain.project.theme.tritium.client.base.button.Css3ButtonCellAppearance;
import tld.domain.project.theme.tritium.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources;
import tld.domain.project.theme.tritium.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle;

import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritonButtonCellAppearance<M> extends Css3ButtonCellAppearance<M> {

  public interface TritonButtonStyle extends Css3ButtonStyle {
  }

  public TritonButtonCellAppearance() {
    this(GWT.<Css3ButtonCellAppearance.Css3ButtonResources> create(Css3ButtonResources.class));
  }

  public TritonButtonCellAppearance(Css3ButtonResources resources) {
    super(resources);
  }

  @Override
  protected boolean applyMenuArrowClass() {
    return true;
  }
}
