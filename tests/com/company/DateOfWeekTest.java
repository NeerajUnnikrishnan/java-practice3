package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateOfWeekTest {

    DateOfWeek date;

    @Before
    public void setUp() throws Exception {

        date = new DateOfWeek();

    }

    @After
    public void tearDown() throws Exception {

        date =null;

    }

    @Test
    public void getDate() {
        String[] dateArray = {"Sun 16/09/2018","Sat 22/09/2018"};
        assertEquals(dateArray, date.getDate());
    }
}