package az.edu.turing.module01.tasks2;

public class SavingsAccount extends BankAccount{
    private double monthlyInterestRate;
    private int withdrawalLimit;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate) {
        super(accountHolder, balance, accountNumber);
        this.monthlyInterestRate = monthlyInterestRate;
        this.withdrawalLimit = 3;
    }
    public void withdraw(double amount) {
        if (withdrawalLimit > 0 && getBalance() >= amount) {
            super.withdraw(amount);
            withdrawalLimit--;
            System.out.println("Remaining withdrawal limit: " + withdrawalLimit);
        } else {
            System.out.println("The withdrawal limit is over or the balance is insufficient!");
        }
    }
    public void applyInterest() {
        double interest = getBalance() * monthlyInterestRate / 100;
        deposit(interest);
        System.out.println("Percentage applied: " + interest + " AZN");
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Monthly interest rate:" + monthlyInterestRate + "%");
        System.out.println("Remaining withdrawal limit: " + withdrawalLimit);
    }
}
