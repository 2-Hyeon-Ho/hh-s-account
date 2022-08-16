public class PrintLimitedBankAccount {
    public void printLimitedBankAccount(Account account) {
        LimitedBankAccount printAccount = (LimitedBankAccount)account;
        System.out.println("Account Number: 0001-" + AccountNumber.getAccountNumber());
        System.out.println("Owner Name: " + printAccount.getOwnerName());
        System.out.println("Balance: " + printAccount.getBalance());
        System.out.println("Limited Balance: " + printAccount.getBalanceLimit());
    }
}
