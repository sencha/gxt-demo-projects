package tld.domain.project.theme.tritium.custom.client.field;

import com.google.gwt.core.client.GWT;

import tld.domain.project.theme.tritium.client.base.field.Css3RadioAppearance;

public class TritonRadioAppearance extends Css3RadioAppearance {

  public interface TritonRadioResources extends Css3RadioResources {

    @Override
    @Source({"tld/domain/project/theme/tritium/client/base/field/Css3ValueBaseField.gss",
            "tld/domain/project/theme/tritium/client/base/field/Css3CheckBox.gss",
            "tld/domain/project/theme/tritium/client/base/field/Css3Radio.gss", "TritonRadio.gss"})
    TritonRadioStyle style();
  }

  public interface TritonRadioStyle extends Css3RadioStyle {
  }

  public TritonRadioAppearance() {
    super(GWT.<TritonRadioResources> create(TritonRadioResources.class));
  }
}