package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionCheckerTest {

    ExceptionChecker checker;

    @Before
    public void setUp() throws Exception {

        checker=  new ExceptionChecker();

    }

    @Test
    public void main() {

        assertEquals("You are in finally block! ", checker.main("Hello World"));
    }
}