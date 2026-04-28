/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

class Grader {
    int score;

    Grader(int score) {
        this.score = score;
    }

    char letterGrade() {
        if (score >= 90) return 'O';
        else if (score >= 80) return 'E';
        else if (score >= 70) return 'A';
        else if (score >= 60) return 'B';
        else if (score >= 50) return 'C';
        else return 'F';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score!");
            return;
        }

        Grader g = new Grader(score);
        System.out.println("Grade: " + g.letterGrade());
    }
}