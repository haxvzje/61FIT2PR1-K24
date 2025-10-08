package week6.pr1.objects.exercises.banking;

public class BankAccount {
    private final String holderName;
    private double interestRate;
    private double balance;
    private int transactions;

    // Init class
    public BankAccount(String holderName, double initial) {
        this.holderName = holderName;
        this.balance = initial;
        this.transactions = 1;
    }

    // Getter(s)
    private String getHolderName() {
        return this.holderName;
    }

    private double getBalance() {
        return this.balance;
    }

    private double getInterestRate() {
        return this.interestRate;
    }

    private int getTransactions() {
        return this.transactions;
    }

    // Setter(s)
    private void setBalance(double balance) {
        this.balance = balance;
    }

    private void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    private void setTransactions(int transactions) {
        this.transactions = transactions;
    }


    // Other method(s)
    @Override
    public String toString() {
        return getHolderName() + ", " + (getBalance() < 0 ? "-" : "") + "$" + Math.abs(getBalance());
    }

    public void transfer(BankAccount account, double amount) {
        withdraw(amount + 0.5);
        account.deposit(amount);
        setTransactions(getTransactions() + 1);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        setTransactions(getTransactions() + 1);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        setTransactions(getTransactions() + 1);
    }

    public void monthlyFee() {
        this.withdraw(10);
    }
}