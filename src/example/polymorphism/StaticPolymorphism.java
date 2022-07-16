package example.polymorphism;

public class StaticPolymorphism {
    public static void showInfo(String fullName) {
        System.out.println("Name: " + fullName);
    }

    public static void showInfo(String fullName, String adress, Integer age) {
        System.out.printf("Name: %s\nAdress: %s\nAge: %s\n",fullName, adress, age);
    }

    public static void main(String[] args) {
        showInfo("Qo'ziyev G'iyosbek", "Xorazm", 25);
    }
}
