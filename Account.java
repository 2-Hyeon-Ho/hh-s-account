import java.math.BigDecimal;

public abstract class Account {
    protected BigDecimal balance;
    protected String ownerName;
    protected String accountNumber;
    protected String type;

    public Account(String ownerName, BigDecimal balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public BigDecimal deposit(BigDecimal amount) {
        synchronized(this){
            this.balance = this.balance.add(amount);
            return this.balance;
        }
    }

    public boolean isWithDraw(BigDecimal amount) {
        synchronized(this) {
            if(amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0) {
                return false;
            } else {
                balance = balance.subtract(amount);
                return true;
            }
        }
    }

    public BigDecimal withDraw(BigDecimal amount) {
        synchronized(this) {
            if(isWithDraw(amount) == true) {
                this.balance = this.balance.subtract(amount);
                return this.balance;
            }else {
                System.out.println("출금가능 금액을 넘었습니다");
                return this.balance;
            }
        }
    }

    public void remit(Account fromAccount, BigDecimal money) {
        synchronized(this) {
            if(fromAccount.isWithDraw(money)) {
                this.deposit(money);
            }
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setAccountType(String type) {
        this.type = type;
    }

    
}
