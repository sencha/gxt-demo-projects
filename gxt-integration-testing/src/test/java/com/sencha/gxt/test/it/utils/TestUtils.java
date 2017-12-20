package com.sencha.gxt.test.it.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtils {

  /**
   * Returns an int from text of a web element. This fails if null.
   *
   * @param element is the WebElement
   *
   * @return the numbers in the string
   */
  public static int getIntFromText(WebElement element) {
    String text = element.getText();
    return Integer.parseInt(text.replaceAll("[^0-9]+", ""));
  }

  /**
   * Returns the inner html of the element.
   *
   * @param driver is the WebDriver
   * @param element is the WebElement
   *
   * @return the innerHTML
   */
  public static String getInnerHtml(WebDriver driver, WebElement element) {
    return (String)((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;", element);
  }

}
