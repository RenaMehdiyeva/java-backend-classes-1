package az.edu.turing.module01.WalletManagementSystem;

public class Wallet {
    private Integer id;
    private Integer userId;
    private Double balance;

    public Wallet(Integer id, Integer userId) {
        this.id = id;
        this.userId = userId;
        this.balance = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(Double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }
}