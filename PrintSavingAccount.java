import java.util.Scanner;

public class PrintSavingAccount {
    public void printSavingAccount(Account account) {
        SavingAccount printAccount = (SavingAccount)account;
        System.out.println("Account Number: 0002-" + AccountNumber.getAccountNumber());
        System.out.println("Owner Name: " + printAccount.getOwnerName());
        System.out.println("Balance: " + printAccount.getBalance());
        System.out.print("중도해지 여부 o/x : ");
        Scanner scanner = new Scanner(System.in);
        String detect = scanner.nextLine();
        printAccount.terminate(detect);
        if(printAccount.getIsTerminate() == true) {
            System.out.println("중도 해지된 계좌입니다.");
        }else {
            System.out.println("terminate: " + printAccount.getContractDate());
        }
    }
}
