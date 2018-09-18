package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumTest {

    ConsecutiveNum tester;

    @Before
    public void setUp() throws Exception {

        tester = new ConsecutiveNum();

    }

    @After
    public void tearDown() throws Exception {

        tester = null;

    }

    @Test
    public void findConsecutiveNum() {

        assertTrue(tester.findConsecutiveNum("1 2 3 4 5"));
    }
}