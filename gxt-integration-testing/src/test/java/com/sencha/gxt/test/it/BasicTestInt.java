package com.sencha.gxt.test.it;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.senchalabs.gwt.gwtdriver.by.ByWidget;
import org.senchalabs.gwt.gwtdriver.by.FasterByChained;
import org.senchalabs.gwt.gwtdriver.gxt.models.Field;
import org.senchalabs.gwt.gwtdriver.models.GwtWidget;

public class BasicTestInt extends BaseTest {

  @Test
  public void testComboExists() throws InterruptedException {
    gotoUrl("http://examples.sencha.com/gxt/4.0.2/#ExamplePlace:basicdatabinding");

    // Could use a wait function, instead of pausing
    Thread.sleep(700);

    // Given a content panel
    // Debugging: Break after this to confirm element is found
    // Using .//* from root takes a long time from root. ensureDebugId can speed finding widget/element to target.
    WebElement framedPanelElement = driver.findElement(new FasterByChained(By.xpath(".//*"),
        new ByWidget(driver, com.sencha.gxt.widget.core.client.ContentPanel.class)));

    // When a text fields exists and something typed in
    // Debugging: Break after this to confirm element is found
    Field textField = GwtWidget.find(Field.class, driver).withLabel("Name").withElement(framedPanelElement).done();
    textField.sendKeys("abc");
    
    // Then the combo is not null
    Assert.assertNotNull(textField);
    // And value equals abc
    Assert.assertEquals("Apple Inc.abc", textField.getValue());
  }

}
