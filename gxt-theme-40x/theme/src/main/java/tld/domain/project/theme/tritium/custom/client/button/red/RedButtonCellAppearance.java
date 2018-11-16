package tld.domain.project.theme.tritium.custom.client.button.red;

import com.google.gwt.core.client.GWT;

import tld.domain.project.theme.tritium.client.base.button.Css3ButtonCellAppearance;

public class RedButtonCellAppearance<M> extends Css3ButtonCellAppearance<M> {

  public interface RedCss3ButtonStyle extends Css3ButtonStyle {
  }

  public interface RedCss3ButtonResources extends Css3ButtonResources {
    @Override
    @Source({ "tld/domain/project/theme/tritium/client/base/button/Css3ButtonCell.gss",
        "tld/domain/project/theme/tritium/client/base/button/Css3ButtonCellToolBar.gss", "RedButton.gss" })
    RedCss3ButtonStyle style();
  }

  public RedButtonCellAppearance() {
    super(GWT.<Css3ButtonResources>create(RedCss3ButtonResources.class));
  }

}
