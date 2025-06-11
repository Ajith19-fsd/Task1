package Task4;

// Question 2: Create a class Voter(voterId, Name, Age) with Parameterized Constructor.
// The Parameterized Constructor should throw a checked/Unchecked exception
// if age is less than 18. The message of exception is "invalid age for voter".

class Voter {
    private final int voterId;
    private final String name;
    private final int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Qus2 {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1001, "Ajith", 20);
            voter1.displayDetails();

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}