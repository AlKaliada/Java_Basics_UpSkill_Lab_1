package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
public class Task8 {
    public static void changeColumnsInMatrix(int[][] matrix)throws IOException {
        if (!CheckMatrix.isMatrix(matrix)){
            System.out.print("Is not a matrix");
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the column numbers to be replaced");
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        if (m < 0 || m >= matrix[0].length || n < 0 || n >= matrix[0].length){
            System.out.println("You entered incorrect numbers of columns");
        }

        int a;
        for (int i = 0; i < matrix.length; i++) {
            a = matrix[i][m];
            matrix[i][m] = matrix[i][n];
            matrix[i][n] = a;
        }
    }
}
