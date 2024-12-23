package az.edu.turing.module01.tasks2;

public class SavingsAccount extends BankAccount {
    private double monthlyInterestRate;
    private int withdrawalLimit = 3;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate) {
        super(accountHolder, balance, accountNumber);
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public void withdraw(double amount) {
        if (withdrawalLimit > 0 && getBalance() >= amount) {
            super.withdraw(amount);
            withdrawalLimit--;
        }
    }

    public void applyInterest() {
        double interest = getBalance() * (monthlyInterestRate / 100);
        deposit(interest);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate + "%");
        System.out.println("Remaining Withdrawals: " + withdrawalLimit);
    }
}