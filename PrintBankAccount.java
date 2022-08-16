public class PrintBankAccount {
    public void printBankAccount(Account account) {
        BankAccount printAccount = (BankAccount)account;
        System.out.println("Account Number: 0000-" + AccountNumber.getAccountNumber());
        System.out.println("Owner Name: " + printAccount.getOwnerName());
        System.out.println("Balance: " + printAccount.getBalance());
    }
}
