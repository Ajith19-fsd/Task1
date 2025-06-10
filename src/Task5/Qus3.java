package Task5;

// Question 3: You are a teacher in school. In your class there are 10 students, You have
// decided to give special gifts to those students whose names start with "A".
// You are asked to separate those students with the help of a Java program.
// Requirement:
// 1.Use list interface to store the student name.
// 2.Use a lambda expression and the Stream API to filter the students.

import java.util.Arrays;
import java.util.List;

public class Qus3 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
                "Ajay", "Ravi", "Anita", "Kumar", "Arun",
                "Divya", "Asha", "John", "Amit", "Meena"
        );

        List<String> giftedStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println("Students who will receive gifts: " + giftedStudents);
    }
}