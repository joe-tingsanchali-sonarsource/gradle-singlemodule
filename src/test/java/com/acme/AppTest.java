package com.acme;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppTest {
  @Test
  public void testAppHasAGreeting() {
    App classUnderTest = new App();
//    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    classUnderTest.getGreeting();
    classUnderTest.getGreeting4();
    classUnderTest.getGreeting5();
  }

  @Test
  public void mainHasGreeting() {
    App classUnderTest = new App();
//    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    App.main();
  }
}
