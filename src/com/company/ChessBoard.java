package com.company;

public class ChessBoard {
    public static String[][] createChessBoard(){
        String[][] chessBoardArray = new String[8][8];

        for(int i=0;i<8;i=i+2){
            for(int j=0;j<7;j=j+2){
                chessBoardArray[i][j]   = "WW|";
                chessBoardArray[i][j+1] = "BB|";
            }
        }
        for(int i=1;i<8;i=i+2){
            for(int j=0;j<7;j=j+2){
                chessBoardArray[i][j]   = "BB|";
                chessBoardArray[i][j+1] = "WW|";
            }
        }
       return chessBoardArray;

    }
}
