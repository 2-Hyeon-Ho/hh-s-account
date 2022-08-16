import java.math.BigDecimal;

public class BankAccount extends Account {
    protected String ownerName;
    protected BigDecimal balance;

    public BankAccount(String ownerName, BigDecimal balance) {
        super(ownerName, balance);
    }

}
