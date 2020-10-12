package com.acme;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DuplicationFunTest extends TestCase {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        print("Hello Baeldung Readers!!");
        assertEquals("Hello Baeldung Readers!!", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCheckPrime() {
        DuplicationFun classUnderTest = new DuplicationFun();
        classUnderTest.checkPrime();
    }

    @Test
    public void testCheckPrimeAgain() {
        DuplicationFun classUnderTest = new DuplicationFun();
        classUnderTest.checkPrimeAgain();
    }

    @Test
    public void testCheckPrimeAgain3() {
        DuplicationFun classUnderTest = new DuplicationFun();
        classUnderTest.checkPrimeAgain3();

        assertEquals("29 is a prime number.", outputStreamCaptor.toString().trim());
    }

    private void print(String output) {
        System.out.println(output);
    }
}
