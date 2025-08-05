/* Assume the existence of a BankAccount class with a method, getAvailable that returns the amount of available funds in the account (as an integer), and a subclass, OverdraftedAccount with two integer instance variables:
• overdraftLimit that represents the amount of money the account holder can borrow from the account (such as the amount the account balance can go negative)
• and overdraftAmount, the amount of money already borrowed against the account
Override the getAvailable method in OverdraftedAccount to return the amount of funds available (as returned by the getAvailable method of the BankAccount class) plus the
overdraftLimit minus the overdraftAmount */
public class BankAccount {
    private int available;

    public BankAccount(int available) {
        this.available = available;
    }

    public int getAvailable() {
        return available;
    }
}

public class OverdraftedAccount extends BankAccount {
    private int overdraftLimit;
    private int overdraftAmount;

    public OverdraftedAccount(int available, int overdraftLimit, int overdraftAmount) {
        super(available);
        this.overdraftLimit = overdraftLimit;
        this.overdraftAmount = overdraftAmount;
    }

    @Override
    public int getAvailable() {
        return super.getAvailable() + (overdraftLimit - overdraftAmount);
    }
}
