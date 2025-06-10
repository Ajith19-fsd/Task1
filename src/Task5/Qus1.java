package Task5;

// Question 1: Write a program using map() method, to convert a list of Strings into uppercase.
// If the given List is: Stream names = Stream.of ("aBc","d","ef");

import java.util.stream.Stream;

public class Qus1 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");

        names
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}