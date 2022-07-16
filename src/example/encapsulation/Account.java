package example.encapsulation;

public class Account {

    private final String ACCOUNT_NUMBER;
    private String owner;
    private double balance;
    private String expireDate;

    public Account(String ACCOUNT_NUMBER, String owner, double balance, String expireDate) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.owner = owner;
        this.balance = balance;
        this.expireDate = expireDate;
    }

    public Account(String ACCOUNT_NUMBER) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        if (balance > 0)
            this.balance = balance;
        else
            throw new RuntimeException("Balance most be positive!");
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = this.expireDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ACCOUNT_NUMBER='" + ACCOUNT_NUMBER + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }
}
