// WAP to perform addition of two matrix.
package day_19;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];

        System.out.println("Enter a 4 number for first 2*2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = Sc.nextInt();

        System.out.println("Enter a 4 number for second 2*2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = Sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Sum of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.println(sum[i][j] + "");
            System.out.println();
        }
    }
}