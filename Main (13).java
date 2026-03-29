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

    // Multiply method
    Matrix multiply(Matrix m2) {
        Matrix result = new Matrix(this.rows, m2.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                result.mat[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    result.mat[i][j] += this.mat[i][k] * m2.mat[k][j];
                }
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

        // Multiply matrices
        Matrix result = m1.multiply(m2);

        System.out.println("Resultant Matrix:");
        result.display();
    }
}