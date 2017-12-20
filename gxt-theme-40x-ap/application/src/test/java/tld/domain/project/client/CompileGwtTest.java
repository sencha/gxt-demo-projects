package tld.domain.project.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "tld.domain.project.Project";
  }

  public void testSandbox() {
    assertTrue(true);
  }
}
