package az.edu.turing.module01.BankingApplicationTask;

public class CustomerValidator {
    public void validateCustomer(String customerName) throws InvalidCustomerException {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new InvalidCustomerException("Username is incorrect!");
        }
    }
}


