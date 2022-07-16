package example.whilee;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        /*System.out.println(" Sizga qaysi raqam karra jadvali kerak? Raqamni kiriting: ");
        int num = scanner.nextInt();
            System.out.println(num + " Sonining karra jadvali: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }*/

        // 2
        /*System.out.println(" x ni kiriting: ");
        int x = scanner.nextInt();
        System.out.println(" y ni kiriting: ");
        int y = scanner.nextInt();
        System.out.println(" p ni kiriting: ");
        int p = scanner.nextInt();
        System.out.println(" x va y sonlari orasidagi p ga karrali sonlar: ");

        for (int i = x; i <= y; i++) {
            if (i % p == 0)
                System.out.print( i + " " );
        }*/

        // 3
       /* System.out.println(" n ni kiriting: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            sum += i;
        }
        System.out.println(" 0 dan " + n + " gacha bo'lgan butun sonlar yig'indisi " + sum + " ga teng ");*/

        // 4

        /*System.out.println(" Raqamlari takrorlanmaydigan barcah 3 xonali sonlar: ");
        for (int i = 100; i < 1000 ; i++) {

            // x - 3 xonali son oxirgi raqami
            int x = i % 10;
            // y - 3 xonali son oxirgi 2 raqami
            int y = i % 100;
            // z - 3 xonali son 2 - raqami
            int z = y / 10;
            // m - 3 xonali son 1 - raqami
            int m = i / 100;

            if (x != z && x != m && m != z)
                System.out.print(i + " ");

        }*/

        // 5
        /*int n = 7;
        for (int i = 1; i <= 14; i++) {
            System.out.print(n * i + " ");
        }*/
    }
}
