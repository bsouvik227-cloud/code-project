/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.getData();
                    students.add(s);
                    break;

                case 2:
                    System.out.print("Enter Registration Number to search: ");
                    String reg = sc.nextLine();
                    boolean found = false;

                    for (Student st : students) {
                        if (st.getRegdNo().equals(reg)) {
                            System.out.println("Student Found. Migrating...");
                            students.remove(st);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Student st : students) {
                            st.printData();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
