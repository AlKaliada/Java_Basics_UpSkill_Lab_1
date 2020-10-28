package com.epam.kaliada.javaalgorithmization.arraysofarrays;

public class CheckMatrix {
    public static boolean isMatrix(int[][] matrix){
        if (matrix.length <= 0 || matrix[0].length <= 0){
            return false;
        }
        int columnsLength = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != columnsLength){
                return false;
            }
        }
        return true;
    }

    public static boolean isMatrixSquare(int[][] matrix){

        if (matrix.length <=0 || matrix[0].length <= 0){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length){
                return false;
            }
        }
        return true;
    }
}
