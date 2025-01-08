package az.edu.turing.module01.WalletManagementSystem;

import java.util.Date;

public class Transaction {
    private String type; // depozit, withdraw, transfer
    private Double amount;
    private Date date;
    private Integer sourceWalletId;
    private Integer destinationWalletId;

    public Transaction(String type, Double amount, Integer sourceWalletId, Integer destinationWalletId) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
        this.sourceWalletId = sourceWalletId;
        this.destinationWalletId = destinationWalletId;
    }

    public void printTransaction() {
        System.out.println("Transaction Type: " + type);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
        if (sourceWalletId != null) {
            System.out.println("Source Wallet ID: " + sourceWalletId);
        }
        if (destinationWalletId != null) {
            System.out.println("Destination Wallet ID: " + destinationWalletId);
        }
    }
}
