package Task4;

// Question 4: Create a HashMap where keys are student names (strings) and
// values are their Corresponding grades (integers). create methods to add
// a new student, remove a student, and display up a student's grade by name.

import java.util.HashMap;
import java.util.Scanner;

public class Qus4 {

    private static final HashMap<String, Integer> studentMap = new HashMap<>();

    public static void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    public static void removeStudent(String name) {
        if (studentMap.containsKey(name)) {
            studentMap.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void displayGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentMap.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            String name;
            int grade;

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    grade = scanner.nextInt();
                    addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    name = scanner.nextLine();
                    displayGrade(name);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}