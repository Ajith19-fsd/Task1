package Task4;

// Question 1: Ramesh is developing a student management system for a university.
// In this system, you have a student class to represent student information. You are asked to help
// Ramesh to handle exception which can be occurred in the program according to following scenarios.
// a.Class Student with Attributes, Roll no, Name, Age, and Course.
// Initialize Values through Parameterized Constructors.
// b.If the age of the student is not between 15 and 21 then
// generate a user-defined exception "AgeNotWithinRangeException".
// c.If a name contains numbers or special symbols, raise exception
// "NameNotValidException". Define the two exception classes.

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private final int rollNo;
    private final String name;
    private final int age;
    private final String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not between 15 and 21.");
        }

        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name contains invalid characters (only letters and spaces allowed).");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Qus1 {
    public static void main(String[] args) {
        try {
            Student student = new Student(101, "Ajith", 20, "BBA");
            student.displayDetails();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}