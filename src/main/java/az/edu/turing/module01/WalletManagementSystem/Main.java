package az.edu.turing.module01.WalletManagementSystem;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(Integer.valueOf(2), "Rena", "rena@email.com");
        Wallet wallet1 = new Wallet(Integer.valueOf(2), user1.getId());

        User user2 = new User(Integer.valueOf(1), "Leyla", "leyla@email.com");
        Wallet wallet2 = new Wallet(Integer.valueOf(1), user1.getId());

        wallet1.deposit(150.0);
        wallet1.withdraw(30.0);

        Double transferAmount = 50.0;
        if (wallet1.withdraw(transferAmount)) {
            wallet2.deposit(transferAmount);
            Transaction transferTransaction = new Transaction("transfer", transferAmount, wallet1.getId(), wallet2.getId());
            transferTransaction.printTransaction();
        }
    }
}