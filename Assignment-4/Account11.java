class Account11 {
    private double balance;

    // Constructor to initialize balance
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Account class
        Account account = new Account(1000.0);

        // Deposit and withdraw multiple times
        account.deposit(500.0);
        account.withdrawal(200.0);
        account.deposit(100.0);
        account.withdrawal(1500.0); // This will fail due to insufficient balance
        account.withdrawal(300.0);

        // Check the final balance
        double finalBalance = account.checkBalance();
        System.out.println("Final Balance: " + finalBalance);
    }
}
