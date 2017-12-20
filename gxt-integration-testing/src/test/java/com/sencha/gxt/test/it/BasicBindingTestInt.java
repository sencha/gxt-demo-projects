package com.sencha.gxt.test.it;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.senchalabs.gwt.gwtdriver.by.ByWidget;
import org.senchalabs.gwt.gwtdriver.by.FasterByChained;

public class BasicBindingTestInt extends BaseTest {

  @Test
  public void testComboExists() throws InterruptedException {
    // TODO change to example project with dev build
    gotoUrl("http://google.com");

    // Given a content panel
    WebElement framedPanelElement = driver.findElement(new FasterByChained(By.xpath(".//*"), new ByWidget(driver,
        com.sencha.gxt.widget.core.client.ContentPanel.class)));

    // When looking for combo in panel 
    WebElement comboElement = framedPanelElement.findElement(new FasterByChained(By.xpath(".//*"), new ByWidget(driver,
        com.sencha.gxt.widget.core.client.form.ComboBox.class)));

    // Then the combo is not null
    Assert.assertNotNull(comboElement);
  }

}
