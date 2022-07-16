package tasks;

import javax.swing.*;
import java.util.Scanner;

public class If {
    // 1-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();
            if (a > 0) {
                System.out.println(++a);
            }
            else {
                System.out.println(a);
            }
    }*/
    // 2-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(++a);
        }
        else {
            a -= 2;
            System.out.println(a);
        }
    }*/
    // 3-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(++a);
        }
        else if (a < 0) {
            a -=2;
            System.out.println(a);
        }
        else {
            a = 10;
            System.out.println(a);
        }
    }*/
    // 4-Masala
    /*public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("a = ");
            int a = scanner.nextInt();

        System.out.println("b = ");
            int b = scanner.nextInt();

        System.out.println("c = ");
            int c = scanner.nextInt();

            if (a > 0 && b > 0 && c >0){
                System.out.println("3 ta musbat son bor");
            }
            else if (a >0 && b >0 && c < 0) {
                System.out.println("2 ta musbat son bor");
            }
            else if (a > 0 && b < 0 && c >0) {
                System.out.println("2 ta musbat son bor");
            }
            else if (a < 0 && b >0 && c <0) {
                System.out.println(" 1 ta musbat son bor");
            }
            else if (a > 0 && b < 0 && c <0) {
                System.out.println("1 ta musbat son bor");
            }
            else if (a < 0 && b < 0 && c > 0) {
                System.out.println("1 ta musbat son bor");
            }
            else if (a < 0 && b > 0 && c > 0 ) {
                System.out.println("2 ta musbat son bor");
            }
            else {
                System.out.println("Musbat son mavjud emas");
            }


    }*/
    // 5-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();

        System.out.println("b = ");
        int b = scanner.nextInt();

        System.out.println("c = ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c >0){
            System.out.println("3 ta musbat son bor, manfiy son yo'q");
        }
        else if (a >0 && b >0 && c < 0) {
            System.out.println("2 ta musbat va 1 ta manfiy son bor");
        }
        else if (a > 0 && b < 0 && c >0) {
            System.out.println("2 ta musbat va 1 ta manfiy son bor");
        }
        else if (a < 0 && b >0 && c <0) {
            System.out.println(" 1 ta musbat va 2 ta manfiy son bor");
        }
        else if (a > 0 && b < 0 && c <0) {
            System.out.println("1 ta musbat va 2 ta manfiy son bor");
        }
        else if (a < 0 && b < 0 && c > 0) {
            System.out.println("1 ta musbat va 2 ta manfiy son bor");
        }
        else if (a < 0 && b > 0 && c > 0 ) {
            System.out.println("2 ta musbat va 1 ta manfiy son bor");
        }
        else {
            System.out.println("Musbat son mavjud emas, 3 ta manfiy son bor");
        }


    }*/
    // 6-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" a = ");
            int a = scanner.nextInt();

        System.out.println(" b = ");
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println("a katta");
            }
            else if (b > a) {
                System.out.println("b katta");
            }
            else {
                System.out.println("a = b");
            }
    }*/
    // 7-Masala
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-raqam : ");
            int a = scanner.nextInt();

        System.out.println("2-raqam: ");
            int b = scanner.nextInt();

            if (a < b) {
                System.out.println("1-raqam");
            }
            else if (b < a) {
                System.out.println("2-raqam");
            }
            else {
                System.out.println( " a soni b ga teng" );
            }
    }*/
    // 8-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        int a = scanner.nextInt();

        System.out.println("b = ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
            System.out.println(b);
        }
        else if (b > a){
            System.out.println(b);
            System.out.println(a);
        }
        else {
            System.out.println("a = b");
        }
    }*/
    // 9-Masala
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
            int a = scanner.nextInt();

        System.out.println("b = ");
            int b = scanner.nextInt();

        if (a < b) {
            System.out.println(a);
            System.out.println(b);
        }
        else {
            b = a + 1;
            System.out.println(a);
            System.out.println(b);
        }
    }*/
    // 10-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a=");
            int a = scanner.nextInt();

            System.out.println("b=");
                int b = scanner.nextInt();

                    if (a != b) {
                        a = b = a + b;
                        System.out.println(a);
                        System.out.println(b);
                    }
                    else if (a == b) {
                        a = 0;
                        b = 0;
                        System.out.println(a);
                        System.out.println(b);
                    }
    }*/
    // 11-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
            int a = scanner.nextInt();

        System.out.println("b = ");
            int b = scanner.nextInt();

            if (a != b && a > b) {
                b = a;
                System.out.println(a);
                System.out.println(b);
            }
            else if (a != b && b > a) {
                a = b;
                System.out.println(a);
                System.out.println(b);
            }
            else if (a == b) {
                a = b = 0;
                System.out.println(a);
                System.out.println(b);
            }
    }*/
    // 12-Masala
    /*public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("a =");
            int a = scanner.nextInt();

        System.out.println("b =");
            int b = scanner.nextInt();

        System.out.println("c =");
            int c = scanner.nextInt();

            if (a > b && b > c) {
                System.out.println(c);
            }
            else if (b > c && c > a) {
                System.out.println(a);
            }
            else if (c > a && a > b) {
                System.out.println(b);
            }
            else if (a > c && c > b) {
                System.out.println(b);
            }
            else if (b > a && a > c) {
                System.out.println(c);
            }
            else if (c > b && b > a) {
                System.out.println(a);
            }
    }*/
    // 13-Masala
    /*public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("a =");
            int a = scanner.nextInt();

        System.out.println("b =");
            int b = scanner.nextInt();

        System.out.println("c =");
            int c = scanner.nextInt();

            if (a > b && b > c) {
                b = (a + c) / 2;
            System.out.println(b);

            } else if (b > c && c > a) {
                c = (b + a) / 2;
            System.out.println(c);
        }
        else if (c > a && a > b) {
            a = (c + b) / 2;
            System.out.println(a);
        }
        else if (a > c && c > b) {
            c = (a + b) / 2;
            System.out.println(c);
        }
        else if (b > a && a > c) {
            a = (b + c) / 2;
            System.out.println(a);
        }
        else if (c > b && b > a) {
            b = (a + c) / 2;
            System.out.println(b);
        }
    }*/
    // 14-Masala
    /*public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("a =");
        int a = scanner.nextInt();

        System.out.println("b =");
        int b = scanner.nextInt();

        System.out.println("c =");
        int c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println(c);
            System.out.println(a);

        } else if (b > c && c > a) {
            System.out.println(a);
            System.out.println(b);
        }
        else if (c > a && a > b) {
            System.out.println(b);
            System.out.println(c);
        }
        else if (a > c && c > b) {
            System.out.println(b);
            System.out.println(a);
        }
        else if (b > a && a > c) {
            System.out.println(c);
            System.out.println(b);
        }
        else if (c > b && b > a) {
            System.out.println(a);
            System.out.println(c);
        }
    }*/
    // 15-Masala
    /*public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("a =");
        int a = scanner.nextInt();

        System.out.println("b =");
        int b = scanner.nextInt();

        System.out.println("c =");
        int c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println(a);
            System.out.println(b);

        } else if (b > c && c > a) {
            System.out.println(c);
            System.out.println(b);
        }
        else if (c > a && a > b) {
            System.out.println(a);
            System.out.println(c);
        }
        else if (a > c && c > b) {
            System.out.println(c);
            System.out.println(a);
        }
        else if (b > a && a > c) {
            System.out.println(a);
            System.out.println(b);
        }
        else if (c > b && b > a) {
            System.out.println(b);
            System.out.println(c);
        }
    }*/
    // 16-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a =");
        int a = scanner.nextInt();

        System.out.println("b =");
        int b = scanner.nextInt();

        System.out.println("c =");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println(2*a);
            System.out.println(2*b);
            System.out.println(2*c);
        }
        else {
            System.out.println(-a);
            System.out.println(-b);
            System.out.println(-c);
        }
    }*/
    // 17-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a =");
            int a = scanner.nextInt();

        System.out.println("b =");
            int b = scanner.nextInt();

        System.out.println("c =");
            int c = scanner.nextInt();

        if (a < b && b < c || a > b && b > c) {
            System.out.println(2*a);
            System.out.println(2*b);
            System.out.println(2*c);
        }
        else {
            System.out.println(-a);
            System.out.println(-b);
            System.out.println(-c);
        }
    }*/
    // 18-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a =");
        int a = scanner.nextInt();

        System.out.println("b =");
        int b = scanner.nextInt();

        System.out.println("c =");
        int c = scanner.nextInt();

        if (a == b) {
            System.out.println("uchinchi");
        }
        else if (b == c) {
            System.out.println("birinchi");
        }
        else if (a == c) {
            System.out.println("ikkinchi");
        }
    }*/
    // 19-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a =");
            int a = scanner.nextInt();

        System.out.println("b =");
            int b = scanner.nextInt();

        System.out.println("c =");
            int c = scanner.nextInt();

        System.out.println("c =");
            int d = scanner.nextInt();

            if (a == b && b == c ) {
                System.out.println("to'rtinchi");
            }
            else if (a == b && b == d) {
                System.out.println("uchinchi");
            }
            else if (a == c && c == d) {
                System.out.println("ikkinchi");
            }
            else if (b == c && c == d) {
                System.out.println("birinchi");
            }
    }*/
    // 20-Masala
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
            int a = scanner.nextInt ();

        System.out.println("b = ");
            int b = scanner.nextInt ();

        System.out.println("c = ");
            int c = scanner.nextInt ();

            if (a - b > 0 && a - c > 0 && b - c > 0) {
                System.out.println(a - b);
            }
            else if (a - b > 0 && a - c > 0 && b - c < 0) {
                System.out.println(a - c);
            }
            else if (a - b < 0 && a - c < 0 && b - c < 0) {
                System.out.println(a - b);
            }
            else if (a - b < 0 && a - c < 0 && c - b < 0) {
                System.out.println(a - c);
            }
            else if (a - b > 0 && a - c < 0) {
                System.out.println();
            }
    }*/
    // 21-Masala




}
