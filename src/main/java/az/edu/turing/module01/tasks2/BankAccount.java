package az.edu.turing.module01.tasks2;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount(String accountHolder, double balance, int accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " for " + amount + " AZN deposited.");
        } else {
            System.out.println("The amount is incorrect!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(accountHolder + " for " + amount + " AZN was withdrawn.");
        } else {
            System.out.println("Insufficient balance for withdrawal!");
        }
    }
    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && balance >= amount) {
            this.withdraw(amount);
            recipient.deposit(amount);
            System.out.println(accountHolder + " account " + amount + " transferred AZN: " + recipient.getAccountHolder());
        } else {
            System.out.println("Transfer is not possible!");
        }
    }
    public void displayInfo() {
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: " + balance + " AZN");
    }
}

