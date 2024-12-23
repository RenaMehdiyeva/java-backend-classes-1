package az.edu.turing.module01.tasks2;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, int accountNumber, double overdraftLimit) {
        super(accountHolder, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        }
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
