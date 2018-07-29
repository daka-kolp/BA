package com.dakakolp;

public class Matrix {

    public int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }
        return matrix;
    }

    public int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] mulMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < mulMatrix.length; i++) {
            for (int j = 0; j < mulMatrix[i].length; j++) {
                mulMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return mulMatrix;
    }

}
