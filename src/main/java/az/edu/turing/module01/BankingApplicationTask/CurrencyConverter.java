package az.edu.turing.module01.BankingApplicationTask;

public class CurrencyConverter {
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!isSupportedCurrency(fromCurrency) || !isSupportedCurrency(toCurrency)) {
            throw new UnsupportedCurrencyException("This currency is not supported!");
        }
        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
        return amount * exchangeRate;
    }

    private boolean isSupportedCurrency(String currency) {
        return currency.equals("USD") || currency.equals("EUR") || currency.equals("AZN");
    }

    private double getExchangeRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return 1.0;
        }
        switch (fromCurrency + ":" + toCurrency) {
            case "USD:EUR": return 0.94;
            case "USD:AZN": return 1.4;
            case "EUR:USD": return 1.07;
            case "EUR:AZN": return 1.76;
            case "AZN:USD": return 0.48;
            case "AZN:EUR": return 0.49;
            default: return 1.0;
        }
    }
}
