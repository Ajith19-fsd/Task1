package Task4;

// Question 3: Store name of weekdays in an array (starting from "Sunday" at 0 index).
// Ask day position from user and print day name. Handle array index out of bound
// exception and give proper message if user enters day index outside range (0-6).

import java.util.Scanner;

public class Qus3 {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day index (0 to 6): ");

        try {
            int index = scanner.nextInt();
            System.out.println("Day: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a number between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        scanner.close();
    }
}