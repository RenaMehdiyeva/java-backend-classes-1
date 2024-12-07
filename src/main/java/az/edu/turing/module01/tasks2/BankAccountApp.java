package az.edu.turing.module01.tasks2;

public class BankAccountApp {

    public static void main(String[] args) {

        SavingsAccount savings1 = new SavingsAccount("Rena Mehdiyeva", 3000, 205, 8.4);
        SavingsAccount savings2 = new SavingsAccount("Lale Hamidova", 2500, 204, 7.8);
        CurrentAccount current1 = new CurrentAccount("Aynur Mammedova", 4200, 103, 5.7);
        CurrentAccount current2 = new CurrentAccount("Dilber Mirzoyeva", 3600, 105, 4.8);
        BankAccount generalAccount = new BankAccount("Vusal Atashov", 7000, 101);

        BankAccount[] accounts = {savings1, savings2, current1, current2, generalAccount};

        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println("--------------------");
        }

        savings1.withdraw(500);
        savings2.applyInterest();
        current1.withdraw(800);
        current2.deposit(400);


        savings1.transfer(current1, 250);
        generalAccount.transfer(savings2, 150);
    }
}

