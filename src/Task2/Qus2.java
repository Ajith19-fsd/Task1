package Task2;

// Question 2: Create class product (pid, price, quantity) with parameterized constructor.
// Create a main function in different class ( say ProductMain ) and perform following task:
// a. Accept five product information from user and store in an array
// b. Find Pid of the product with the highest price.
// c. Create method ( with array of product's object as argument ) in ProductMain
// class to calculate and return the total amount spent on all products.
// (amount spent on single product=price of product * quantity of product

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Qus2 {

    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        double maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }
        System.out.println("\nProduct ID with highest price: " + maxPid);

        double total = calculateTotalAmount(products);
        System.out.println("Total amount spent: " + total);

        scanner.close();
    }
}