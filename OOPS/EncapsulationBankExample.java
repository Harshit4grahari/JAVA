//Encapsulation = Data hiding + Access control
//Benefits of Encapsulation
//Protects data from unauthorized access (using private keyword)
//Provides control over how data is accessed/modified (via getters/setters)
//Makes code more maintainable and flexible
//Improves security and reliability
package OOPS;

class BankAccount {
    // 🔒 Private fields
    private String accountHolder;
    private long accountNumber;
    private double balance;

    // ✅ Constructor
    public BankAccount(String accountHolder, long accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // ✅ Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // ✅ Getter for account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // ✅ Getter for balance
    public double getBalance() {
        return balance;
    }

    // ✅ Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // ✅ Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }
}

public class EncapsulationBankExample {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Harshit", 1234567890L, 1000.0);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Current Balance: ₹" + acc.getBalance());

        acc.deposit(500);   // Deposit money
        acc.withdraw(300);  // Withdraw money
        acc.withdraw(2000); // Try to overdraw

        System.out.println("Final Balance: ₹" + acc.getBalance());
    }
}
