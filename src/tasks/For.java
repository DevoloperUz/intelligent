package tasks;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1-Masala

       /* System.out.println("N = ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++ ) {
            if (N % i == 0) {
                System.out.println(i);
            }
            else {
                continue;
            }
        }*/

        // 2-masala

        /*System.out.println("N = ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++ ) {
            if (N % i == 0) {
                System.out.println(i);
                sum += i;
                System.out.println(sum);
            }
            else {
                continue;
            }
        }*/

        // 3-masala

        /*System.out.println("N = ");
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < N; i++ ) {
            if (N % i == 0)
                sum += i;
            }
        if (sum == N) {
            System.out.println("Mukammal son");
        }
        else {
            System.out.println("Oddiy son");
        }*/

        // 4-Masala

        /*System.out.println("N = ");
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < N; i++ ) {
            if (N % i == 0)
                sum += i;

            if (sum == N)
                System.out.println(sum);
            else
                continue;
        }*/

        // 5-Masala

        /*int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println(i);
            else
                continue;
        }*/

        // 6- 7-Masala

        // 1-Usul

        /*System.out.println("n = ");
        int n = scanner.nextInt();

        int countOfPrime = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                countOfPrime++;
                System.out.println(i + "");
            }
        }

    }

    private static boolean isPrime(int number) {
        if (number == 1) return false;

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        return count == 2;*/

        // 2-Usul

        /*System.out.println("n = ");
        int n = scanner.nextInt();

        int countOfPrime = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime2(i)) {
                countOfPrime++;
                System.out.println(i + "");
            }
        }

    }

    private static boolean isPrime2(int number) {
        if (number == 1) return false;

        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;*/

        // 8-Masala

        // 9-Masala

        // 10-Masala

        /*System.out.println(" k = ");
            int k = scanner.nextInt();

        System.out.println("n = ");
            int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
            if (n > 0)
                System.out.println(k);

        else continue;*/

        // 11-Masala

        /*int count = 0;

        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++)
            if (a < b)
                System.out.println(i);

        count++;
        System.out.println(count);*/

        // 12-masala

        // 13-Masala

        /*System.out.print("x = ");
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
            if (x > 0)
                System.out.println(x * i);
        else continue;*/

        // 14-Masala

       /* System.out.print("x = ");
        int x = scanner.nextInt();

        for (double i = 0.10; i <= 1.0; i += 0.10)

            if (x > 0)

                System.out.println(x * i);

            else continue;*/

        // 15-Masala

        /*System.out.print("x = ");
        int x = scanner.nextInt();

        for (double i = 1.20; i <= 2.0; i += 0.20)

            if (x > 0)

                System.out.println(x * i);

            else continue;*/

        // 16-Masala

        // 17-Masala

        // 18-Masala

    }
}
