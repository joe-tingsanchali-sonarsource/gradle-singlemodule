package com.acme;

import junit.framework.TestCase;

public class DuplicationFunTest extends TestCase {

    public void testCheckPrime() {
        DuplicationFun classUnderTest = new DuplicationFun();
        classUnderTest.checkPrime();
    }

    public void testCheckPrimeAgain() {
        DuplicationFun classUnderTest = new DuplicationFun();
        classUnderTest.checkPrimeAgain();
    }
}
