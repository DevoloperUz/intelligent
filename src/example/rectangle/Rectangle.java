package example.rectangle;

public class Rectangle {
    public static int total;

    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        total = sumOfNumbers(a, b);
        System.out.println(total);

    }

    private static int sumOfNumbers(int a, int b) {
        return (int) Math.pow((a + b),2);
    }
}
