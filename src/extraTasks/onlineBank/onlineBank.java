package extraTasks.onlineBank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class onlineBank {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ism: ");
        String name = scanner.nextLine();

        System.out.print(" Parol: ");
        String password = scanner.nextLine();



        int balance = 15000;

        System.out.println(" Online bankga xush kelibsiz, " + name + "!" + " Joriy balance: $ " + balance);
        System.out.println("---------- MENU ---------");

        while (true) {

            System.out.println("1. Balance ");
            System.out.println("2. Add Money ( Hisobga Pul Qo'yish )");
            System.out.println("3. Withdraw ( Pul Yechish ) ");
            System.out.println("4. Last Operation ");
            System.out.println("0. Exit ");

            int choice = scanner.nextInt();
            if (choice < 0 || choice > 4)
                System.out.println(" Bunday Raqamli Buyruq yo'q! ");

            switch (choice) {

                case 0:
                    System.out.println(" Xizmatimizdan foydalanganinggiz uchun rahmat! ");
                    break;

                case 1:
                    System.out.println(" Balansinggizda $ 15000 Mavjud! ");
                    break;

                case 2:
                    System.out.println(" Hisobga Qo'shiladigan Summani Kiriting: ");
                    int money = scanner.nextInt();

                    if (money > 0) {
                        balance += money ;

                        System.out.println(" Sizning Balansinggiz: $ " + balance + " ga teng bo'ldi! ");

                    }else
                        System.out.println(" Xatolik! Hisobga Qo'yiladigan Mablag' Manfiy Bo'lishi Mumkin Emas !");
                    break;

                case 3:
                    System.out.println(" Hisobinggizdan Qancha Pul Yechmoqchisiz: ");
                    int wMoney = scanner.nextInt();

                    if (wMoney > 0 ) {
                        balance -= wMoney;
                        System.out.println(" Balansinggizda $ " + balance + " Qoldi! " );
                    } else
                        System.out.println(" Xatolik! Kiritilgan Miqdor Musbat Bo'lishi Lozim! ");
                    break;

                case 4:
                    System.out.println(" Sizda Oxirgi Bajarilgan Operatsiyalar Hisoboti Mavjud Emas! ");
                    break;

            }

        }

    }*/
}
