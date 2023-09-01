public class Main {
    public static void main(String[] args) {
        BankAccount DaQuanAccount = new BankAccount();

        // Deposit
        DaQuanAccount.deposit("checking", 1000);
        DaQuanAccount.deposit("savings", 500);

        // Check Balance
        System.out.println("Checking Balance: " + DaQuanAccount.getCheckingBalance());
        System.out.println("Savings Balance: " + DaQuanAccount.getSavingsBalance());

    }
}
