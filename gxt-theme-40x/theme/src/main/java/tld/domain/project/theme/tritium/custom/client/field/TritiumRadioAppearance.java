package tld.domain.project.theme.tritium.custom.client.field;

import com.google.gwt.core.client.GWT;

import tld.domain.project.theme.tritium.client.base.field.Css3RadioAppearance;

public class TritiumRadioAppearance extends Css3RadioAppearance {

  public interface TritiumRadioResources extends Css3RadioResources {

    @Override
    @Source({"tld/domain/project/theme/tritium/client/base/field/Css3ValueBaseField.gss",
            "tld/domain/project/theme/tritium/client/base/field/Css3CheckBox.gss",
            "tld/domain/project/theme/tritium/client/base/field/Css3Radio.gss", "TritiumRadio.gss"})
    TritiumRadioStyle style();
  }

  public interface TritiumRadioStyle extends Css3RadioStyle {
  }

  public TritiumRadioAppearance() {
    super(GWT.<TritiumRadioResources> create(TritiumRadioResources.class));
  }
}