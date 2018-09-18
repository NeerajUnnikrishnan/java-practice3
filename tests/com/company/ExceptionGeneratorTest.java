package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionGeneratorTest {

    ExceptionGenerator generator;

    @Before
    public void setUp() throws Exception {

        generator = new ExceptionGenerator();

    }

    @After
    public void tearDown() throws Exception {

        generator = null;

    }

    @Test
    public void generateException() {

        assertEquals("IndexOutOfBoundsException", generator.generateIndexOutOfBoundsException());
        assertEquals("NegativeArraySizeException", generator.generateNegativeArraySizeException());
        assertEquals("NullPointerException", generator.generateNullPointerException());
    }

}