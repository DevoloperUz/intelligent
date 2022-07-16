package example.java8;

public interface Operationable {
    String USER_NAME = "alisher321";
    String PASSWORD = "addedchanges";

    Double sum();
    Double avarage(int a, int b);
    void connectionToDb();

    default String getInfo(double result) {
        return "$" + result;
    }

}
