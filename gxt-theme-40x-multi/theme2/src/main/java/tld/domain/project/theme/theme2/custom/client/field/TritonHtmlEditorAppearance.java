package tld.domain.project.theme.theme2.custom.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.field.HtmlEditorDefaultAppearance;

public class TritonHtmlEditorAppearance extends HtmlEditorDefaultAppearance {

  public interface TritonHtmlEditorResources extends HtmlEditorResources {

    @Source({"com/sencha/gxt/theme/base/client/field/HtmlEditor.gss"})
    @Override
    TritonHtmlEditorStyle css();

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

  public interface TritonHtmlEditorStyle extends HtmlEditorStyle {
  }

  public TritonHtmlEditorAppearance() {
    super(GWT.<TritonHtmlEditorResources> create(TritonHtmlEditorResources.class));
  }
}
