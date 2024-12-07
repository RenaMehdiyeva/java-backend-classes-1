package az.edu.turing.module01.tasks2;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, int accountNumber, double overdraftLimit) {
        super(accountHolder, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            double initialBalance = getBalance();
            super.withdraw(amount);
            if (initialBalance < amount) {
                System.out.println("Overdraft was used.");
            }
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft limit: " + overdraftLimit + " AZN");
    }
}

