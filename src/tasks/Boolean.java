package tasks;

import java.util.Scanner;

public class Boolean {
    // 1-Masala
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a ni kiriting: ");
            int a = scanner.nextInt();
        System.out.println("a soni musbat: ");
                boolean result = a > 0 ? true : false;
        System.out.println(result);

    }*/
    // 2-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("a sonini kiriting: ");
                int a = scanner.nextInt();
        System.out.println("a soni toq son!");
            boolean result = (a % 2 == 1) ? true : false;
        System.out.println(result);
    }*/
    //3-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a ni kiriting");
            int a = scanner.nextInt();
        System.out.println("a soni juft son");
            boolean result = (a % 2 == 0) ? true : false;
        System.out.println(result);
    }*/
    // 4-Masala
    /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("a ni kiriting:");
            int a = scanner.nextInt();
        System.out.println("b ni kiriting:");
            int b = scanner.nextInt();
        System.out.println("c ni kiriting:");
            int c = scanner.nextInt();
        System.out.println("b soni a va c sonlari orasida yotadi!");
            boolean result = (b > a && b < c) ? true : false;
        System.out.println(result);
    }*/
    // 5-Masala
    /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("a ni kiriting: ");
            int a = scanner.nextInt();
        System.out.println("b ni kiriting: ");
            int b = scanner.nextInt();
        System.out.println("a va b sonlari toq sonlar!");
            boolean result = (a % 2 ==1 && b % 2 == 1) ? true : false;
        System.out.println(result);
    }*/
    // 6-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a ni kiriting: ");
            int a = scanner.nextInt();
        System.out.println("b ni kiriting: ");
            int b = scanner.nextInt();
        System.out.println("a va b sonlarning hech bo'lmaganda bittasi toq son!");
            boolean result = (a % 2 == 1 || b % 2 == 1) ? true : false;
        System.out.println(result);
    }*/
    //7-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("b = ");
            int b = scanner.nextInt();
        System.out.println("a va b sonlarning faqat bittasi toq son!");
            boolean result = (a % 2 == 1 && b % 2 == 0) || (a % 2 == 0 && b % 2 == 1) ? true : false;
        System.out.println(result);
    }*/
    // 8-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("b = ");
            int b = scanner.nextInt();
        System.out.println("a va b sonlarning ikkalasi ham toq yoki juft son");
            boolean result = (a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1) ? true : false;
        System.out.println(result);
    }*/
    // 9-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("b = ");
            int b = scanner.nextInt();
        System.out.println("c = ");
            int c = scanner.nextInt();
        System.out.println("a, b va c sonlarning har biri musbat");
            boolean result = (a > 0 && b > 0 && c > 0) ? true : false;
        System.out.println(result);
    }*/
    // 10-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("b = ");
            int b = scanner.nextInt();
        System.out.println("c = ");
            int c = scanner.nextInt();
        System.out.println("a, b va c sonlarning hech bo'lmaganda bittasi musbat");
            boolean result = (a > 0 || b > 0 || c > 0) ? true : false;
        System.out.println(result);
    }*/
    // 11-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("b = ");
            int b = scanner.nextInt();
        System.out.println("c = ");
            int c = scanner.nextInt();
        System.out.println("a, b va c sonlardan faqat bittasi musbat");
            boolean result = (a > 0 && b < 0 && c < 0) || (b > 0 && a < 0 && c < 0) || (c > 0 && b < 0 && a < 0) ? true : false;
        System.out.println(result);
    }*/
    // 12-Masala
    /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("b = ");
            int b = scanner.nextInt();
        System.out.println("c = ");
            int c = scanner.nextInt();
        System.out.println("a, b va c sonlardan faqat ikkitasi musbat");
            boolean result = (a < 0 && b > 0 && c > 0) || (b < 0 && a > 0 && c > 0) || (c < 0 && b > 0 && a > 0) ? true : false;
        System.out.println(result);

    }*/
    // 13-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("Kiritilgan son 2 xonali juft son! ");
            boolean result = (a > 9 && a < 100 && a % 2 == 0) ? true : false;
        System.out.println(result);
    }*/
    // 14-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("Kiritilgan son 3 xonali toq son! ");
            boolean result = (a > 99 && a < 1000 && a % 2 == 1) ? true : false;
        System.out.println(result);
    }*/
    // 15-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("b = ");
            int b = scanner.nextInt();
        System.out.println("c = ");
            int c = scanner.nextInt();
        System.out.println("Kiritilgan 3 ta sonning hech bo'lmaganda 2 tasi bir-biriga teng! ");
            boolean result = (a == b || a == c || b == c) ? true : false;
        System.out.println(result);
    }*/
    // 16-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("b = ");
            int b = scanner.nextInt();
        System.out.println("c = ");
            int c = scanner.nextInt();
        System.out.println("berilgan 3 ta sonning hech bo'lmaganda bir jufti o'zaro qarama-qarshi! ");
            boolean result = (a == -b || a == -c || b == -c) ? true : false;
        System.out.println(result);
    }*/
    // 17-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("Ushbu son 3 xonali va sonning raqamlari ketma-ket o'suvchi bo'lib joylashgan! ");
            boolean result = (a > 99 && a < 1000) && (a == 123 || a == 234 || a == 345 || a == 456 || a == 567 || a == 678 || a == 789) ? true : false;
        System.out.println(result);
    }*/
    // 18 -masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
        System.out.println("Ushbu son 3 xonali va sonning raqamlari ketma-ket o'suvchi yoki ketma-ket kamayuvchi bo'lib joylashgan! ");
            boolean result = (a > 99 && a < 1000) && (a == 123 || a == 234 || a == 345 || a == 456 || a == 567 || a == 678 || a == 789 || a == 987 || a == 876 || a == 765 || a == 654 || a == 543 || a == 432 || a == 321) ? true : false;
        System.out.println(result);
    }*/
    // 19-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
            // a = 123
        int a3 = a % 10; // 3-xonasi  123 % 10 = 3
        a = a / 10;      // dastlabki 2 xonasi 123 / 10 = 12

        int a2 = a % 10; // 2-xonasi  12 % 10 = 2
        int a1 = a / 10; // 1-xonasi  12 / 10 = 1

        System.out.println("Ushbu sonning barcha raqamlari har xil");

        boolean result = a > 99 && a < 1000 && a1 != a2 && a1 != a3 && a2 != a3;
        System.out.println(result);
    }*/
    // 20-masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        // a = 123
        int a3 = a % 10; // 3-xonasi  123 % 10 = 3
        a = a / 10;      // dastlabki 2 xonasi 123 / 10 = 12

        int a2 = a % 10; // 2-xonasi  12 % 10 = 2
        int a1 = a / 10; // 1-xonasi  12 / 10 = 1

        System.out.println("Ushbu sonni o'ngdan o'qiganda ham, chapdan o'qiganda ham bir xil! " );

        boolean result = a > 99 && a < 1000 && a1 == a3;
        System.out.println(result);
    }*/

}
