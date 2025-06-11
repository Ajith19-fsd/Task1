package Task1;

// Question 5: Write a Java program that takes the purchase amount as input and calculates
// The final payable amount after applying the discount.
// 1.If the purchase amount is less than 500, no discount is applied.
// 2.If the purchase amount is between 500 and 1000, a 10% discount is applied.
// 3.If the purchase amount is greater than 1000 a 20% discount is applied.

import java.util.Scanner;

public class Qus5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double finalAmount;

        if (purchaseAmount < 500) {
            finalAmount = purchaseAmount;
        } else if (purchaseAmount <= 1000) {
            finalAmount = purchaseAmount - (purchaseAmount * 0.10);
        } else {
            finalAmount = purchaseAmount - (purchaseAmount * 0.20);
        }

        System.out.println("Final payable amount: " + finalAmount);
    }
}