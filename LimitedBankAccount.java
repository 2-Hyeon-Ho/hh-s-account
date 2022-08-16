import java.math.BigDecimal;

public class LimitedBankAccount extends Account {
    protected BigDecimal balanceLimit;

    public LimitedBankAccount(String ownerName, BigDecimal balance, BigDecimal balanceLimit) {
        super(ownerName, balance);
        this.balanceLimit = balanceLimit;
    }

    public BigDecimal deposit(BigDecimal amount) {
        if(this.balance.add(amount).compareTo(this.balanceLimit) == 1) {
            System.out.println("�ѵ��ݾ��� �ʰ��߽��ϴ�.");
            return this.balance;
        }else {
            return this.balance = this.balance.add(amount);
        }
    }

    public BigDecimal getBalanceLimit() {
        return this.balanceLimit;
    }
}
