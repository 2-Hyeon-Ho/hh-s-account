import java.math.BigDecimal;


public class SavingAccount extends Account {
    protected String contractDate;
    private boolean isTerminate;

    public SavingAccount(String ownerName, BigDecimal balance, String contractDate) {
        super(ownerName, balance);
        this.contractDate = contractDate;
    }

    public void terminate(String detect) {
        
        if(detect.equalsIgnoreCase("o")) {
            this.isTerminate = true;
        }else if(detect.equalsIgnoreCase("x")) {
            this.isTerminate = false;
        }else {
            System.out.println("잘못된 입력입니다.");
        }
        
    }

    public boolean getIsTerminate() {
        return this.isTerminate;
    }

    public String getContractDate() {
        return this.contractDate;
    }
}
