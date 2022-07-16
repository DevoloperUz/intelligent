package extraTasks.fibonacciRecursia;

import java.util.Scanner;

public class fibonacciRecursia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" n = ");
        int n = scanner.nextInt();
        int fibNumOfN = findFib(n);
        System.out.println(n + " - fibonacci soni: " + fibNumOfN);
    }

    private static int findFib(int n) {
        if (n < 2)
            return 1;
        return findFib(n - 1) + findFib(n - 2);
    }
}
