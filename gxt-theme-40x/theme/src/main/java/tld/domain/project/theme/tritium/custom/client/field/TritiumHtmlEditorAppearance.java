package tld.domain.project.theme.tritium.custom.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.field.HtmlEditorDefaultAppearance;

public class TritiumHtmlEditorAppearance extends HtmlEditorDefaultAppearance {

  public interface TritiumHtmlEditorResources extends HtmlEditorResources {

    @Source({"com/sencha/gxt/theme/base/client/field/HtmlEditor.gss"})
    @Override
    TritiumHtmlEditorStyle css();

    ImageResource bold();

    ImageResource fontColor();

    ImageResource fontDecrease();

    ImageResource fontHighlight();

    ImageResource fontIncrease();

    ImageResource italic();

    ImageResource justifyCenter();

    ImageResource justifyLeft();

    ImageResource justifyRight();

    ImageResource link();

    ImageResource ol();

    ImageResource source();

    ImageResource ul();

    ImageResource underline();
  }

  public interface TritiumHtmlEditorStyle extends HtmlEditorStyle {
  }

  public TritiumHtmlEditorAppearance() {
    super(GWT.<TritiumHtmlEditorResources> create(TritiumHtmlEditorResources.class));
  }
}
