package Task1;

// Question 2: Write a program that find a given number is Negative or Positive.
// Input=123 Output=Positive
// Input=-100 Output=Negative

import java.util.Scanner;

public class Qus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}