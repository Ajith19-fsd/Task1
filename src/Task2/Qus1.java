package Task2;

// Question 1: Create a class person with properties (name and age) with following features.
// a. Default age of person should be 18;
// b. A person object can be initialized with name and age;
// c. Method to display name and age of person

public class Qus1 {
    final String Name;
    final int Age;

    public Qus1() {
        this.Name = "Unknown";
        this.Age = 18;
    }

    public Qus1(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
    }

    public static void main(String[] args) {
        Qus1 p1 = new Qus1();
        p1.displayDetails();

        System.out.println("----------------");

        Qus1 p2 = new Qus1("Ajith", 25);
        p2.displayDetails();
    }
}