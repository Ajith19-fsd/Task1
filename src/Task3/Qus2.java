package Task3;

// Question 2: Create Interface Taxable With Members SalesTax=7% and IncomeTax=10.5%.
// Create abstract method calcTax().
// a.Create Class Employee (EmpID, Name, Salary) and Implement Taxable to
// Calculate IncomeTax on Yearly Salary.
// b.Create class product (pid,price,quantity) and implement taxable to calculate
// salesTax on unit price of product.
// c.Create class for main method (say DriverMain),Accept employee information and
// a product information from user and print income tax and sales tax respectively.

import java.util.Scanner;

interface Taxable {
    double salesTax = 0.07;
    double incomeTax = 0.105;

    @SuppressWarnings("unused")
    void calcTax();
}

class Employee implements Taxable {
    int empID;
    String name;
    double salary;

    Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double yearlySalary = salary * 12;
        double tax = yearlySalary * incomeTax;
        System.out.println("Income Tax for " + name + " (Yearly Salary: " + yearlySalary + ") = Rs. " + tax);
    }
}

class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double tax = price * salesTax;
        System.out.println("Sales Tax for Product ID " + pid + " (Unit Price: " + price + ") = Rs. " + tax);
    }
}

public class Qus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(empID, name, salary);

        System.out.print("\nEnter Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        Product product = new Product(pid, price, qty);

        System.out.println("\n--- Tax Calculations ---");
        emp.calcTax();
        product.calcTax();

        sc.close();
    }
}