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

        System.out.println("Main Diagonal Sum = " + mainSum);
        System.out.println("Secondary Diagonal Sum = " + secondSum);
        System.out.println("Total Diagonal Sum = " + total);

        sc.close();
    }
}