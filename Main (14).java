/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class Matrix {
    int rows, cols;
    int[][] mat;

    // Constructor
    Matrix(int r, int c) {
        rows = r;
        cols = c;
        mat = new int[rows][cols];
    }

    // Input method
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    // Subtract method
    Matrix subtract(Matrix m2) {
        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.mat[i][j] = this.mat[i][j] - m2.mat[i][j];
            }
        }
        return result;
    }

    // Display method
    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        System.out.println("Enter first matrix:");
        m1.input();

        System.out.println("Enter second matrix:");
        m2.input();

        // Subtract matrices
        Matrix result = m1.subtract(m2);

        System.out.println("Resultant Matrix after subtraction:");
        result.display();
    }
}