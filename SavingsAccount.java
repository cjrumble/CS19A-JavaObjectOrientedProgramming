// CSCI-19A Object-Oriented Programming
// ASSIGN. 6 === Invoking the Superclass Constructor Problem 2

/* Assume the existence of a BankAccount class with a constructor that accepts two parameters: a string for the account holder's name. followed by an integer for the account number.
Assume a subclass SavingsAccount has been defined with a double instance variable named interestRate. Write a constructor for SavingsAccount that accepts three parameters (in the following order): a string and an integer that are passed to the constructor of BankAccount, and a double that is used to initialize the instance variable. */
public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountHolderName, int accountNumber, double interestRate) {
        super(accountHolderName, accountNumber); // Call the constructor of BankAccount
        this.interestRate = interestRate; // Initialize the interestRate instance variable
    }

    // Additional methods can be added here as needed
}
