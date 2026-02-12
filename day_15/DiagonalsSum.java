package day_15;

import java.util.Scanner;

public class DiagonalsSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int mainSum = 0;
        int secondSum = 0;

        for (int i = 0; i < n; i++) {
            mainSum = mainSum + matrix[i][i];
            secondSum = secondSum + matrix[i][n - 1 - i];
        }

        int total = mainSum + secondSum;

        if (n % 2 == 1) {
            total = total - matrix[n / 2][n / 2];
        }

        System.out.println("Main Diagonal Sum = " + mainSum);
        System.out.println("Secondary Diagonal Sum = " + secondSum);
        System.out.println("Total Diagonal Sum = " + total);

        sc.close();
    }
}