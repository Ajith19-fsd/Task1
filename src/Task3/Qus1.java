package Task3;

// Question 1: Design a Java program that uses OOP principles to model the book.
// Create two classes: book and library. The book class should have attributes such as bookID,
// title, author, and isAvailable. The library class should include an array to store book objects.
// Provide methods to add books, remove books, search books (using id) and display books.
// Write a Java program that demonstrates the use of these classes and methods
// by allowing the user to interact with the library system.

import java.util.Scanner;

class Book {
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void displayBook() {
        System.out.println("ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

class Library {
    Book[] books = new Book[100];
    int count = 0;

    void addBook(Book book) {
        books[count++] = book;
        System.out.println("Book added successfully.");
    }

    void removeBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookID == id) {
                books[i] = books[count - 1];
                books[count - 1] = null;
                count--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void searchBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookID == id) {
                books[i].displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void displayAllBooks() {
        if (count == 0) {
            System.out.println("No books available.");
        }
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }
}

public class Qus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(id, title, author);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = scanner.nextInt();
                    library.searchBook(searchId);
                    break;
                case 4:
                    library.displayAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting Library System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}