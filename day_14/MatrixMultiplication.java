package day_14;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] multiplication = new int[2][2];

        System.out.println("Enter a 4 number for first 2*2 matrix");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = Sc.nextInt();

        System.out.println("Enter a 4 number for secobd 2*2 matrix");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = Sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                multiplication[i][j] = a[i][j] * b[i][j];

        System.out.println("Multiplication of Matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.println(multiplication[i][j] + "");
            System.out.println("");
        }

    }

}