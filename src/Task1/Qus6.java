package Task1;

// Question 6: Write a Java program to print bellowed pattern ->i and j and k=>5
// 5 5 5 5 5
// 5 4 4 4 4
// 5 4 3 3 3
// 5 4 3 2 2
// 5 4 3 2 1

public class Qus6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 5; j >= 5 - i; j--) {
                System.out.print(j + " ");
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print((5 - i) + " ");
            }

            System.out.println();
        }
    }
}