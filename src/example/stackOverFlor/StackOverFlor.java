package example.stackOverFlor;

public class StackOverFlor {
    public static void main(String[] args) {

        int num = 15;
        System.out.println(sum(num));
    }

    private static int sum(int num) {
        return num + sum(num -1);
    }
}
