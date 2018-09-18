package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition adder;

    @Before
    public void setUp() throws Exception {

        adder = new MatrixAddition();

    }

    @After
    public void tearDown() throws Exception {

        adder = null;

    }

    @Test
    public void addMatrix() {

        int[][] sumMatrix = {{10,10},{10,10},{10,10}};
        int[] matrix1 = {1,2,3,4,5,6};
        int[] matrix2 = {9,8,7,6,5,4};
        assertEquals(sumMatrix, adder.addMatrix(3,2,matrix1,matrix2));
    }
}