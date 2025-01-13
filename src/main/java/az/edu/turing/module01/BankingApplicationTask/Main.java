package az.edu.turing.module01.BankingApplicationTask;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount("123456789", 500.00);

            try {
                account.withdraw(600.00);
            } catch (InsufficientBalanceException e) {
                String errorMessage = e.getMessage();
                System.out.println("Error: " + errorMessage);
            }
            CurrencyConverter converter = new CurrencyConverter();

            try {
                double convertedAmount = converter.convert(100.00, "USD", "AZN");
                System.out.println("Amount converted: " + convertedAmount);
            } catch (UnsupportedCurrencyException e) {
                String errorMessage = e.getMessage();
                System.out.println("Error: " + errorMessage);
            }
            CustomerValidator validator = new CustomerValidator();

            try {
                validator.validateCustomer("");
            } catch (InvalidCustomerException e) {
                String errorMessage = e.getMessage();
                System.out.println("Error: " + errorMessage);
            }

        } catch (Exception e) {
            String errorMessage = e.getMessage();
            System.out.println("A general error occurred: " + errorMessage);
        }
    }
}
