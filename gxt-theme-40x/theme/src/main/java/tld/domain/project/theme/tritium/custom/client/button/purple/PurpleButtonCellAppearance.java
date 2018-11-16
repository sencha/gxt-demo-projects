package tld.domain.project.theme.tritium.custom.client.button.purple;

import com.google.gwt.core.client.GWT;

import tld.domain.project.theme.tritium.client.base.button.Css3ButtonCellAppearance;

public class PurpleButtonCellAppearance<M> extends Css3ButtonCellAppearance<M> {

  public interface PurpleCss3ButtonStyle extends Css3ButtonStyle {
  }

  public interface PurpleCss3ButtonResources extends Css3ButtonResources {
    @Override
    @Source({ "tld/domain/project/theme/tritium/client/base/button/Css3ButtonCell.gss",
        "tld/domain/project/theme/tritium/client/base/button/Css3ButtonCellToolBar.gss", "PurpleButton.gss" })
    PurpleCss3ButtonStyle style();
  }

  public PurpleButtonCellAppearance() {
    super(GWT.<Css3ButtonResources>create(PurpleCss3ButtonResources.class));
  }

}
