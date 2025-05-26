package Task4;

// Question 5: Use collection classes to store integers. Create some methods for following functionalities.
// a. Include functions for pushing elements onto the stack.
// b. Popping elements from the stack.
// c. Checking if the stack is empty.

import java.util.Stack;
import java.util.Scanner;

public class Qus5 {
    private static final Stack<Integer> stack = new Stack<>();

    public static void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    public static void popElement() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            System.out.println("Popped: " + removed);
        } else {
            System.out.println("Stack is empty. Nothing to pop.");
        }
    }

    public static void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty. Top element: " + stack.peek());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    int num = scanner.nextInt();
                    pushElement(num);
                    break;
                case 2:
                    popElement();
                    break;
                case 3:
                    checkEmpty();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}