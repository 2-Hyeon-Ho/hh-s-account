import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------�۱� ��--------");
        Account bankAccount = new BankAccount("Lee Hyeon Ho", new BigDecimal(3000));
        PrintBankAccount printBankAccount = new PrintBankAccount();
        printBankAccount.printBankAccount(bankAccount);

        Account limitedAccount = new LimitedBankAccount("Lee Dong Hoon", new BigDecimal(1000), new BigDecimal(5000));
        PrintLimitedBankAccount printLimitedAccount = new PrintLimitedBankAccount();
        printLimitedAccount.printLimitedBankAccount(limitedAccount);

        Account savingAccount = new SavingAccount("Seo Pyeong Won", new BigDecimal(15000), "2025-12-31");
        PrintSavingAccount printSavingAccount = new PrintSavingAccount();
        printSavingAccount.printSavingAccount(savingAccount);
    
        System.out.println("--------�۱� ��--------");
        limitedAccount.remit(savingAccount, new BigDecimal(5000));
        printBankAccount.printBankAccount(bankAccount);
        printLimitedAccount.printLimitedBankAccount(limitedAccount);
        printSavingAccount.printSavingAccount(savingAccount); 

    }
}

//////////�۱��� ���� ���¹�ȣ�� �̾ �����Ǵµ� ������ �߸𸣰ڽ��ϴ�../////