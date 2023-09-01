public class BankAccount {

    // Balance Variables
    private double checkingBalance;
    private double savingsBalance;

    // Create a class member (static) that has the number of accounts created thus far.
    private static int numberOfAccounts = 0;

    // Create a class member (static) that tracks the total amount of money stored in every account created.
    private static int totalMoneyStored = 0;

    // Create the constructor, be sure to increment the account count.
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }

    //Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return checkingBalance;
    }

    //Create a getter method for the user's savings account balance.
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Create a method that will allow a user to deposit money into either the checkings or savings, be sure to add to the total amount stored.
    public void deposit(String account, double amount) {
        if (account.equals("checking")) {
            checkingBalance += amount;
        } else if (account.equals("savings")) {
            savingsBalance += amount;
        } else {
            System.out.println("Invalid account. Please deposit into 'checking' or 'savings'");
            return;
        }
        // Increment total money equal to the amount deposited
        totalMoneyStored += amount;
    }

    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdraw(String account, double amount) {
        if (account.equals("checking")) {
            if (checkingBalance < amount) {
                System.out.println("Insufficient funds in Checking account. Please withdraw a smaller amount");
                return;
            }
            checkingBalance -= amount;
        } else if (account.equals("savings")) {
            if (savingsBalance < amount) {
                if (savingsBalance < amount) {
                    System.out.println("Insufficient funds in Savings account. Please withdraw a smaller amount");
                    return;
                }
                savingsBalance -= amount;
            } else {
                System.out.println("Invalid account type. Please withdraw from 'checking' or 'savings'");
                return;
            }
            totalMoneyStored -= amount;
        }
    }

    // Create a method to see the total money from the checking and savings.
    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }



}
