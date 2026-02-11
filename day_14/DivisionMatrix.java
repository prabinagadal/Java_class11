package day_14;

import java.util.Scanner;

public class DivisionMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A[][] = new double[2][2];
        double B[][] = new double[2][2];
        double inverseB[][] = new double[2][2];
        double result[][] = new double[2][2];

        System.out.println("Enter 4 numbers for first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Enter 4 numbers for second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextDouble();
            }
        }

        double det = (B[0][0] * B[1][1]) - (B[0][1] * B[1][0]);

        if (det == 0) {
            System.out.println("Division not possible (Determinant is 0)");
        } else {

            inverseB[0][0] = B[1][1] / det;
            inverseB[0][1] = -B[0][1] / det;
            inverseB[1][0] = -B[1][0] / det;
            inverseB[1][1] = B[0][0] / det;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < 2; k++) {
                        result[i][j] += A[i][k] * inverseB[k][j];
                    }
                }
            }

            System.out.println("Division of Matrices (A ÷ B):");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
