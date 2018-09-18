package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard maker ;

    @Before
    public void setUp() throws Exception {

        maker = new ChessBoard();

    }

    @After
    public void tearDown() throws Exception {

        maker = null;
    }

    @Test
    public void createChessBoard() {
        String[][] array = {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};

        assertEquals(array,maker.createChessBoard());
    }
}