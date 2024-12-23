package az.edu.turing.module01.tasks2;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new SavingsAccount("Rena Mehdiyeva", 1000, 1, 1.5);
        accounts[1] = new SavingsAccount("Lale Hamidova", 2000, 2, 2.0);
        accounts[2] = new CurrentAccount("Aynur Mammadova", 1500, 3, 500);
        accounts[3] = new CurrentAccount("Dilber Mirzoyeva", 3000, 4, 1000);
        accounts[4] = new BankAccount("Vusal Atashov", 500, 5);

        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println();
        }

        accounts[0].withdraw(100);
        accounts[1].deposit(500);
        accounts[2].withdraw(1800);
        accounts[3].transfer(accounts[4], 200);

        ((SavingsAccount) accounts[0]).applyInterest();

        System.out.println("After Transactions:");
        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println();
        }
    }
}
