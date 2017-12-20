package com.sencha.gxt.test.it.rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class Retry implements TestRule {
  private final int retryCount;

  public Retry(int retryCount) {
    this.retryCount = retryCount;
  }

  @Override
  public Statement apply(final Statement base, final Description description) {
    return new Statement() {
      @Override
      public void evaluate() throws Throwable {
        Throwable caughtThrowable = null;

        for (int i = 0; i < retryCount; i++) {
          try {
            base.evaluate();
            return;
          } catch (Throwable t) {
            caughtThrowable = t;
            t.printStackTrace();
          }
        }
        throw caughtThrowable;
      }
    };
  }

}
