package example.encapsulation;

public class BankOperation {
    public static void main(String[] args) {
        Account account = new Account("8600151687452436");

        account.setOwner("Tohir Karimov");
        account.setExpireDate("2025-04-10");
        account.setBalance(15000.0);

        System.out.println(account);
    }
}
