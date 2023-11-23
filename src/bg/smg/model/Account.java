package bg.smg.model;

public class Account {
    private String IBAN;
    private double amount;
    private Currency currency;

    public Account() {
    }

    public Account(String IBAN, double amount, Currency currency) {
        this.IBAN = IBAN;
        this.amount = amount;
        this.currency = currency;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "IBAN='" + IBAN + '\'' +
                ", amount=" + amount +
                ", currency=" + currency +
                '}';
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
