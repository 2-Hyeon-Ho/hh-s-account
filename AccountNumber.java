public class AccountNumber {
    private static AccountNumber accountNumber;

    private static String nextAccountNumber = "0";

    private AccountNumber() {}

    public synchronized static AccountNumber createAccountNumber(int i) {
        if(accountNumber == null) {
            accountNumber = new AccountNumber();
        }
        return accountNumber;
    }

    public static String getAccountNumber() {
        int accountNumber = Integer.parseInt(nextAccountNumber);
        nextAccountNumber = Integer.toString(++accountNumber);
        return nextAccountNumber;
    }
}
