package com.epam.kaliada.javaalgorithmization.arraysofarrays;

import java.util.Arrays;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,
// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
public class Task16 {
    public static void createMagicSquare(int n){
        int[][] magicMatrix = new int[n][n];
        int y = n / 2;
        int x = 0 - n / 2;
        int count = 0;
        for (int i = 0; i <= n * n; i++) {
            if (x > 0 && x < n && y > 0 && y < n){
                magicMatrix[y][x] = i;
                count++;
                x++;
                y++;
            }else if (x < 0){
                magicMatrix[y][x + n] = i;
                count++;
                x++;
                y++;
            }else if (y < 0){
                magicMatrix[y + n][x] = i;
                count++;
                x++;
                y++;
            }else if (x > n){
                magicMatrix[y][x - n] = i;
                count++;
                x++;
                y++;
            }else if (y > n){
                magicMatrix[y - n][x] = i;
                count++;
                x++;
                y++;
            }
            if (count == n){
                x = x - n - 2;
                y = y - n;
            }
        }
        System.out.println(Arrays.deepToString(magicMatrix));
    }
}
