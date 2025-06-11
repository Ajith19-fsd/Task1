package Task2;

// Question 3: Create Class Account with data member as Balance. Create two constructors
// (no argument, and with argument) and perform following task
// a. method to deposit the amount to the account.
// b. method to withdraw the amount from the account.
// c. method to display the Balance.

public class Qus3 {
    private double balance;

    public Qus3() {
        this.balance = 0.0;
    }

    public Qus3(double initialBalance) {
        if (initialBalance >= 0)
            this.balance = initialBalance;
        else
            this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Qus3 acc1 = new Qus3();
        acc1.deposit(1000);
        acc1.withdraw(300);
        acc1.displayBalance();

        System.out.println("-------------------");

        Qus3 acc2 = new Qus3(5000);
        acc2.withdraw(1000);
        acc2.deposit(500);
        acc2.displayBalance();
    }
}