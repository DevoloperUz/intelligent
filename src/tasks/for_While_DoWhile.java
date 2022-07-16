package tasks;

import java.util.Scanner;

public class for_While_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1-Masala

        /*int num = 5;
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " * " + i + " = " + i * num);*/

        // 2-Masala

        /*System.out.print("x = ");
        int x = scanner.nextInt();

        System.out.print("y = ");
        int y = scanner.nextInt();

        System.out.print("p = ");
        int p = scanner.nextInt();

        for (int i = x; i <= y; i++)
            if (i % p == 0)
                System.out.println(i);
        else continue;*/

        // 3-Masala

        /*System.out.print("n = ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);*/

        // 4-Masala

        /*System.out.println("Raqamlari takrorlanmaydigan barcha 3 xonali sonlar: ");

        for (int i = 100; i < 1000; i++) {
            int a ;
            a = i % 10;  // 3

            int b;
            b = i / 10; // birinchi 2 ta raqami

            int c;
            c = b % 10; // 2

            int d;
            d = b / 10; // 1

            if (a != c && a != d && c != d)
                System.out.println(i);

        }*/

        // 5-Masala

        /*int n = 7;
        for (int i = 1; i <= 14; i++)
            System.out.print(n * i + " ");*/

        // 6-Masala

        /*for (int i = 1; i <= 512; i *= 2)
            System.out.print(i + " ");*/

        // 7-Masala

        // 8-Masala

        /*System.out.println("100-500 oraliqda raqamlari yig'indisi 15 ga teng bo'lgan sonlar: ");

        for (int i = 100; i < 500; i++) {
            int a ;
            a = i % 10;  // 3

            int b;
            b = i / 10; // birinchi 2 ta raqami

            int c;
            c = b % 10; // 2

            int d;
            d = b / 10; // 1

            if (a + d + c == 15)
                System.out.print(i + " ");

        }*/

        // 9-Masala

        /*int S = 10;
        int count = 1;
        
        for (int i = 10; i <= 20; i += 0.1 * i) {
            count++;
            if (i == 20)
                System.out.println(count);
            continue;
        }
        for (int i = 10; i <= 100 ; i += 0.1 * i) {
            count++;
            S += i;
            if (S == 100)
                System.out.println(count);
            return;
        }*/

        // 10-Masala

       /* for (int i = 30; i < 100 ; i++) {
            int a = i % 10; // oxirgi raqami

            if (i % 3 == 0 && i % 2 == 0 && a != 0 && a != 6)
                System.out.print(i + " ");
        }*/

        // 11-Masala

        /*int n = 100;

        for (int i = 1; i <= 100; i++) {
            if (isPrime2(i))
                System.out.println(i + "");

        }

    }

    private static boolean isPrime2(int number) {
        if (number == 1) return false;

        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;*/
    }
}
