package Task2;

// Question 4: Define a base class Person with attributes name and age.
// Create a subclass Employee that inherits from person and adds attributes like employeeID and salary.
// Use the super Keyword to initialize the person attributes in the Employee constructor.

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int employeeID;
    double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

public class Qus4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Ajith", 28, 101, 45000.0);

        emp.displayInfo();
    }
}