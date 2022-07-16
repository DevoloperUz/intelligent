package extraTasks.onlineBankingV2;

public class Account {
    private final int cardNumber;
    private final String cardHolder;
    private final String cardCompany;
    private int balance;
    private String password;
    private boolean status = true;


    public Account(int cardNumber, String cardHolder, String cardCompany) {

        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cardCompany = cardCompany;
    }

    public Account(int cardNumber, String cardHolder, String cardCompany, int balance, String password, boolean status) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cardCompany = cardCompany;
        this.balance = balance;
        this.password = password;
        this.status = status;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardCompany() {
        return cardCompany;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "cardNumber: " + cardNumber +
                        "| cardHolder: " + cardHolder +
                        "| cardCompany: " + cardCompany +
                        "| balance: " + balance +
                        "| password: " + password +
                        "| status: " + status;
    }
}
