package Task5;

// Question 4: Rajesh has been given a task to create an app which takes the user's birthdate as input and
// calculates their age, you have to help him to build this app using the java.time.LocalDate class.

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Qus4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " +
                age.getDays() + " days.");

        scanner.close();
    }
}