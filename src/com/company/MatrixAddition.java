package com.company;

public class MatrixAddition {
    public int[][] addMatrix(int row, int col, int[] matrix1, int[] matrix2) {
        int[][] sumMatrix = new int[row][col];
        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMatrix[i][j] = matrix1[k] + matrix2[k];
                k++;
            }
        }
        return  sumMatrix;
    }
}