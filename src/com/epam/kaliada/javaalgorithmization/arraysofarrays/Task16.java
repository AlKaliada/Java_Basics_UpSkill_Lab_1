package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.ArrayList;
import java.util.Arrays;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,
// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
public class Task16 {
    public static void createMagicSquare(int n){
        if (n % 2 != 0 && n >= 3){
            createMagicSquareWithOddN(n);
        }else if (n % 4 == 0 && n >= 4){
            createMagicSquareWithNMultipleOfFour(n);
        }else {
            System.out.println("Try entering an odd number or multiple of 4");
        }
    }
    private static void createMagicSquareWithOddN(int n){ //метод террас
        int[][] magicMatrix = new int[n][n];
        int y = n / 2;
        int x = - n / 2;
        int count = 0;
        for (int i = 1; i <= n * n; i++) {
            if (x >= 0 && x < n && y >= 0 && y < n){
                magicMatrix[y][x] = i;
                count++;
                x++;
                y--;
            }else if (x < 0){
                magicMatrix[y][x + n] = i;
                count++;
                x++;
                y--;
            }else if (y < 0){
                magicMatrix[y + n][x] = i;
                count++;
                x++;
                y--;
            }else if (x >= n){
                magicMatrix[y][x - n] = i;
                count++;
                x++;
                y--;
            }else {
                magicMatrix[y - n][x] = i;
                count++;
                x++;
                y--;
            }
            if (count == n){
                x = x - n + 1;
                y = y + n + 1;
                count = 0;
            }
        }
        System.out.println(Arrays.deepToString(magicMatrix));
    }

    private static void createMagicSquareWithNMultipleOfFour(int n){
        int[][] magicSquare = new int[n][n];
        int x = 0;
        int y = 0;
        int count = 0;
        for (int i = 1; i < n * n;) {
            for (int j = 1; j <= n / 2; j++) { //вправо вверх
                if (x >= 0 && x < n && y >= 0 && y < n){
                    magicSquare[y][x] = i;
                    x++;
                    y--;
                    count++;
                    i++;
                }else if (y < 0){
                    magicSquare[y + n][x] = i;
                    x++;
                    y--;
                    count++;
                    i++;
                }else {
                    magicSquare[y - n][x] = i;
                    x++;
                    y--;
                    count++;
                    i++;
                }
                if (count == n / 2){
                    y = y + 1;
                    count = 0;
                }
            }
            for (int j = 1; j <= n / 2; j++) { //вправо вниз
                if (x >= 0 && x < n && y >= 0 && y < n){
                    magicSquare[y][x] = i;
                    x++;
                    y++;
                    count++;
                    i++;
                }else if (y < 0){
                    magicSquare[y + n][x] = i;
                    x++;
                    y++;
                    count++;
                    i++;
                }else {
                    magicSquare[y - n][x] = i;
                    x++;
                    y++;
                    count++;
                    i++;
                }
                if (count == n / 2){
                    x = x - 1;
                    count = 0;
                }
            }
            for (int j = 1; j <= n / 2; j++) { //влево вниз
                if (x >= 0 && x < n && y >= 0 && y < n){
                    magicSquare[y][x] = i;
                    x--;
                    y++;
                    count++;
                    i++;
                }else if (y < 0){
                    magicSquare[y + n][x] = i;
                    x--;
                    y++;
                    count++;
                    i++;
                }else {
                    magicSquare[y - n][x] = i;
                    x--;
                    y++;
                    count++;
                    i++;
                }
                if (count == n / 2){
                    y = y - 1;
                    count = 0;
                }
            }
            for (int j = 1; j <= n / 2; j++) { //влево вверх
                if (x >= 0 && x < n && y >= 0 && y < n){
                    magicSquare[y][x] = i;
                    x--;
                    y--;
                    count++;
                    i++;
                }else if (y < 0){
                    magicSquare[y + n][x] = i;
                    x--;
                    y--;
                    count++;
                    i++;
                }else {
                    magicSquare[y - n][x] = i;
                    x--;
                    y--;
                    count++;
                    i++;
                }
                if (count == n / 2){
                    x = x + n;
                    y = y + 2;
                    count = 0;
                }
            }
            for (int j = 1; j <= n / 2; j++) { //влево вверх
                if (x >= 0 && x < n && y >= 0 && y < n){
                    magicSquare[y][x] = i;
                    x--;
                    y--;
                    count++;
                    i++;
                }else if (y < 0){
                    magicSquare[y + n][x] = i;
                    x--;
                    y--;
                    count++;
                    i++;
                }else {
                    magicSquare[y - n][x] = i;
                    x--;
                    y--;
                    count++;
                    i++;
                }
                if (count == n / 2){
                    y = y + 1;
                    count = 0;
                }
            }
            for (int j = 1; j <= n / 2; j++) { //влево вниз
                if (x >= 0 && x < n && y >= 0 && y < n){
                    magicSquare[y][x] = i;
                    x--;
                    y++;
                    count++;
                    i++;
                }else if (y < 0){
                    magicSquare[y + n][x] = i;
                    x--;
                    y++;
                    count++;
                    i++;
                }else {
                    magicSquare[y - n][x] = i;
                    x--;
                    y++;
                    count++;
                    i++;
                }
                if (count == n / 2){
                    x = x + 1;
                    count = 0;
                }
            }
            for (int j = 1; j <= n / 2; j++) { //вправо вниз
                if (x >= 0 && x < n && y >= 0 && y < n){
                    magicSquare[y][x] = i;
                    x++;
                    y++;
                    count++;
                    i++;
                }else if (y < 0){
                    magicSquare[y + n][x] = i;
                    x++;
                    y++;
                    count++;
                    i++;
                }else {
                    magicSquare[y - n][x] = i;
                    x++;
                    y++;
                    count++;
                    i++;
                }
                if (count == n / 2){
                    y = y - 1;
                    count = 0;
                }
            }
            for (int j = 1; j <= n / 2; j++) { //вправо вверх
                if (x >= 0 && x < n && y >= 0 && y < n){
                    magicSquare[y][x] = i;
                    x++;
                    y--;
                    count++;
                    i++;
                }else if (y < 0){
                    magicSquare[y + n][x] = i;
                    x++;
                    y--;
                    count++;
                    i++;
                }else {
                    magicSquare[y - n][x] = i;
                    x++;
                    y--;
                    count++;
                    i++;
                }
                if (count == n / 2){
                    x = x - n;
                    y = y + 2;
                    count = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(magicSquare));
    }

    public static void createMagicSquareBySelection(int n){
        int[][] magicSquare = new int[n][n];
        int matrixOrder = n * (n * n + 1) / 2;
        ArrayList<Integer> numbersForMagicSquare = new ArrayList<>();
        for (int i = 1; i <= n * n; i++) {
            numbersForMagicSquare.add(i);
        }
        boolean magic = false;
        int count = 0;
        while (!magic){
            ArrayList<Integer> copy = new ArrayList<>(numbersForMagicSquare);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int a = (int) (Math.random() * copy.size());
                    magicSquare[i][j] = copy.get(a);
                    copy.remove(a);
                }
            }
            count++;
            //System.out.println(Arrays.deepToString(magicSquare));
        magic = checkColumns(magicSquare, matrixOrder) && checkStrings(magicSquare, matrixOrder) && checkDiagonals(magicSquare, matrixOrder);

        }
        System.out.println(count);
        System.out.println(Arrays.deepToString(magicSquare));
    }

    private static boolean checkStrings(int[][] matrix, int matrixOrder){
        boolean strings = true;
        int sumString;
        for (int i = 0; i < matrix.length; i++) {
            sumString = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumString += matrix[i][j];
            }
            if (sumString != matrixOrder){
                strings = false;
                break;
            }
        }
        return strings;
    }

    private static boolean checkColumns(int[][] matrix, int matrixOrder){
        boolean columns = true;
        int sumColumn;
        for (int i = 0; i < matrix.length; i++) {
             sumColumn = 0;
             for (int j = 0; j < matrix.length; j++) {
                 sumColumn += matrix[j][i];
             }
             if (sumColumn != matrixOrder){
                 columns = false;
                 break;
             }
        }
        return columns;
    }

    private static boolean checkDiagonals(int[][] matrix, int matrixOrder){
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
            for (int i = 0; i < matrix.length; i++) {
                sumDiagonal1 += matrix[i][i];
                sumDiagonal2 += matrix[i][matrix.length - i - 1];
            }
        return sumDiagonal1 == matrixOrder && sumDiagonal2 == matrixOrder;
    }

}
