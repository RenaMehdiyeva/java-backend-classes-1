package az.edu.turing.module01.tasks2;

import java.util.Objects;

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

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && balance >= amount) {
            this.withdraw(amount);
            recipient.deposit(amount);
        }
    }

    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}