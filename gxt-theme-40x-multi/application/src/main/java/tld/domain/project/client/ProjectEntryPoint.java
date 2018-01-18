package tld.domain.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.InlineHTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.AbstractHtmlLayoutContainer.HtmlData;
import com.sencha.gxt.widget.core.client.container.HtmlLayoutContainer;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.event.CollapseEvent;
import com.sencha.gxt.widget.core.client.event.CollapseEvent.CollapseHandler;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.Radio;
import com.sencha.gxt.widget.core.client.form.StringComboBox;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.TextField;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectEntryPoint implements EntryPoint {

  public interface PageTemplate extends XTemplates {
    @XTemplate(source = "Page.html")
    SafeHtml getPageTemplate();
  }

  @Override
  public void onModuleLoad() {
    final StringComboBox combo = new StringComboBox();
    combo.setTriggerAction(TriggerAction.ALL);
    combo.add("Select Theme 1");
    combo.add("Select Theme 2");
    combo.addCollapseHandler(new CollapseHandler() {
      @Override
      public void onCollapse(CollapseEvent event) {
        combo.finishEditing();
      }
    });
    combo.addValueChangeHandler(new ValueChangeHandler<String>() {
      @Override
      public void onValueChange(ValueChangeEvent<String> event) {
        changeTheme(event.getValue());
      }
    });

    TextButton button = new TextButton("Themed Button");
    button.addSelectHandler(new SelectHandler() {
      @Override
      public void onSelect(SelectEvent event) {
        MessageBox messageBox = new MessageBox("GXT Works.");
        messageBox.show();
      }
    });

    InlineHTML label1 = new InlineHTML("Change Theme :");
    InlineHTML label2 = new InlineHTML("");
    InlineHTML label3 = new InlineHTML("Name :");
    InlineHTML label4 = new InlineHTML("Select :");
    InlineHTML label5 = new InlineHTML("Description :");

    final TextField textField = new TextField();
    textField.addStyleName("flow");

    Radio radio = new Radio();
    final TextArea textArea = new TextArea();
    textArea.addStyleName("flow"); 

    PageTemplate template = GWT.create(PageTemplate.class);
    HtmlLayoutContainer container = new HtmlLayoutContainer(template.getPageTemplate());
    container.add(label1, new HtmlData(".label1"));
    container.add(label2, new HtmlData(".label2"));
    container.add(label3, new HtmlData(".label3"));
    container.add(label4, new HtmlData(".label4"));
    container.add(label5, new HtmlData(".label5"));

    container.add(combo, new HtmlData(".content1"));
    container.add(new HTML("&nbsp;"), new HtmlData(".content2"));
    container.add(textField, new HtmlData(".content3"));
    container.add(radio, new HtmlData(".content4"));
    container.add(textArea, new HtmlData(".content5"));
    container.add(button, new HtmlData(".content6"));

    Viewport vp = new Viewport();
    vp.add(container);

    RootPanel.get().add(vp);

  }

  protected void changeTheme(String value) {
    GWT.log("Change theme value to " + value);

    String theme = "theme1";
    if (value.contains("1")) {
      theme = "theme1";
    } else if (value.contains("2")) {
      theme = "theme2";
    }

    Cookies.setCookie("theme", theme);

    // reload page with different theme
    // project.gwt.xml contains the deferred binding settings
    Window.Location.reload();
  }

}
