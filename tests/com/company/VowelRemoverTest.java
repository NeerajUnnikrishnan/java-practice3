package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemoverTest {

    VowelRemover remover;

    @Before
    public void setUp() throws Exception {

        remover = new VowelRemover();

    }

    @After
    public void tearDown() throws Exception {

        remover = null;

    }

    @Test
    public void removeVowels() {
        String[] inputArray = {"India","Germany","Italy"};
        String[] outputArray = {"nd","Grmny","tly"};


        assertEquals(outputArray, remover.removeVowels(inputArray));
    }
}