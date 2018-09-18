package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks checker ;

    @Before
    public void setUp() throws Exception {

        int[] stuGrades = {3,434,3};
        checker = new StudentMarks(3,stuGrades);

    }

    @After
    public void tearDown() throws Exception {

        checker = null;
    }

    @Test
    public void checkGrades() {

        assertEquals("Error found", checker.checkGrades());

    }
}