package extraTasks.DigitToText;

import java.util.Scanner;

public class DigitToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Son kiriting: ");
        long num = scanner.nextLong();
        String text = digitToText(num);
        System.out.println(text);
    }

    private static String digitToText(long num) {
        String[] birliklar = {"", " Bir ", " Ikki ", " Uch ", " To'rt ", " Besh ", " Olti ", " Yetti ", " Sakkiz ", " To'qqiz "};
        String[] onliklar = {"", " O'n ", " Yigirma ", " O'ttiz ", " Qirq ", " Ellik ", " Oltmish ", " Yetmish ", " Sakson ", " To'qson "};
        String result = " ";

        if ((num / 1000000) > 0) {
            result += digitToText(num / 10000000L) + "million";
            num = num % 1000000L;
        }

        if ((num / 1000L) > 0) {
            result += digitToText(num / 1000) + "ming";
            num = num % 1000L;
        }

        if ((num / 100) > 0) {
            result += digitToText(num / 100) + "yuz";
            num = num % 100;
        }

        if (num > 0) {
            if (num < 10) {
                result += birliklar[(int) num];
            } else {
                result += onliklar[(int) num / 10];
                if ((int) num % 10 > 0) {
                    result +=" " + birliklar[(int) num % 10];
                }
            }
        }
        return result;
    }
}
