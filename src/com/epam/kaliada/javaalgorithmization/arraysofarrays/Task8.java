package com.epam.kaliada.javaalgorithmization.arraysofarrays;
//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
public class Task8 {
    public static void changeColumnsInMatrix(int[][] matrix, int n, int m){
        int a = 0;
        for (int i = 0; i < matrix.length; i++) {
            a = matrix[i][m];
            matrix[i][m] = matrix[i][n];
            matrix[i][n] = a;
        }
    }
}
