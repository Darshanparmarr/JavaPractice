package projectStudentResultManagement;

import java.util.Scanner;

public class StudentResultManagement {

    static final int SUBJECTS = 5;
    static final int STUDENTS = 3;

    static String[] studentNames = new String[STUDENTS];
    static int[][] marks = new int[STUDENTS][SUBJECTS];
    static Integer[] totals = new Integer[STUDENTS];

    static Scanner sc = new Scanner(System.in);

    static void enterStudents() {

        System.out.println("\nEnter Student Names");

        for (int i = 0; i < STUDENTS; i++) {

            System.out.print("Student " + (i + 1) + " : ");
            studentNames[i] = sc.nextLine();
        }
    }

    static void enterMarks() {

        for (int i = 0; i < STUDENTS; i++) {

            System.out.println("\nEnter Marks for " + studentNames[i]);

            for (int j = 0; j < SUBJECTS; j++) {

                System.out.print("Subject " + (j + 1) + " : ");

                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {

                    System.out.println("Invalid Marks! Try Again.");

                    j--;
                    continue;
                }

                marks[i][j] = mark;
            }

            sc.nextLine();
        }
    }

    static int calculateTotal(int[] studentMarks) {

        int total = 0;

        for (int mark : studentMarks) {
            total += mark;
        }

        return total;
    }

    static double calculateAverage(int total) {
        return total / (double) SUBJECTS;
    }

    static char calculateGrade(double avg) {
        if (avg >= 90)
            return 'A';
        else if (avg >= 75)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 35)
            return 'D';
        return 'F';
    }

    static void displayResults() {
        System.out.println("\n========== RESULT CARD ==========\n");
        for (int i = 0; i < STUDENTS; i++) {
            totals[i] = calculateTotal(marks[i]);
            double avg = calculateAverage(totals[i]);
            char grade = calculateGrade(avg);
            StringBuilder sb = new StringBuilder();
            sb.append("\n---------------------------------\n");
            sb.append("Student : ").append(studentNames[i]).append("\n");
            System.out.print(sb);
            System.out.printf("%-15s : %d%n", "Total", totals[i]);
            System.out.printf("%-15s : %.2f%n", "Average", avg);
            System.out.printf("%-15s : %c%n", "Grade", grade);
            System.out.println("Marks : ");
            for (int mark : marks[i]) {
                System.out.print(mark + " ");
            }
            System.out.println("\n---------------------------------");
        }
    }

    static void findTopper() {
        int max = totals[0];
        int index = 0;
        for (int i = 1; i < STUDENTS; i++) {
            if (totals[i] > max) {
                max = totals[i];
                index = i;
            }
        }

        System.out.println("\nTopper : " + studentNames[index]);
        System.out.println("Marks : " + max);
    }

    static void searchStudent() {
        System.out.print("\nEnter Student Name : ");
        String name = sc.nextLine();
        for (int i = 0; i < STUDENTS; i++) {
            if (studentNames[i].equalsIgnoreCase(name)) {
                System.out.println("Student Found");
                System.out.println("Name : " + studentNames[i]);
                System.out.println("Marks");
                for (int mark : marks[i])
                    System.out.print(mark + " ");
                System.out.println();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========= MENU =========");

            System.out.println("1. Enter Students");
            System.out.println("2. Enter Marks");
            System.out.println("3. Display Results");
            System.out.println("4. Find Topper");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");

            System.out.print("Choice : ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    enterStudents();
                    break;

                case 2:
                    enterMarks();
                    break;

                case 3:
                    displayResults();
                    break;

                case 4:
                    findTopper();
                    break;

                case 5:
                    searchStudent();
                    break;

                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    continue;
            }

            if (choice == 6)
                break;
        }

        sc.close();
    }
}
