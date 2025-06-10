package Task5;

// Question 2: Write a program to check whether the Strings in the List are empty or not and print the list having
// non-empty strings. If the given List is: List strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");

import java.util.Arrays;
import java.util.List;

public class Qus2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .toList();

        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}