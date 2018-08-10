package tld.domain.project.theme.tritium.custom.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritiumButtonCellToolBarAppearance<M> extends TritiumButtonCellAppearance<M> {

  public interface TritiumButtonCellResources extends Css3ButtonResources {

    @Override
    @Source({"tld/domain/project/theme/tritium/client/base/button/Css3ButtonCell.gss",
            "tld/domain/project/theme/tritium/client/base/button/Css3ButtonCellToolBar.gss", "TritiumButtonCellToolBar.gss"})
    TritiumButtonCellStyle style();
  }

  public interface TritiumButtonCellStyle extends TritiumButtonStyle {
  }

  public TritiumButtonCellToolBarAppearance() {
    super(GWT.<TritiumButtonCellResources> create(TritiumButtonCellResources.class));
  }
}
