package extraTasks.onlineBankingV2;

import java.util.Scanner;

public class OnlineBankingV2 {
    public static void main(String[] args) {
        // yangi obyekt yaratilganda qiymatlar berish?
        Account account = new Account(86000345,"Nurmetov Temur","Asaka bank",2500,"123321",true);
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[5];

        // statusni active va block chiqarish consolga
        accounts[0] = new Account(86000345, "Nurmetov Temur", "Asaka bank", 2500, "123321", true);
        accounts[1] = new Account(86000346, "Ahmedov Aziz", "Milliy bank", 1500, "123321", true);
        accounts[2] = new Account(86000347, "Tojiyev Ahror", "Ipoteka bank", 3500, "123321", true);
        accounts[3] = new Account(86000348, "Jumanov Adham", "Sanoat qurilish bank", 5000, "123321", true);
        accounts[4] = new Account(86000349, "Jalolov Samad", "Mikrokredit bank", 4800, "123321", true);

        boolean a = true;
        while (a) {

            System.out.printf("-----     Online Banking     -----\n\n 1. Bank operations\n 2. List of accounts\n 0. Exit\n");
            int num = scanner.nextInt();

            switch (num) {
                case 1:

                    break;
                case 2:
                    System.out.println("List of accounts: ");
                    System.out.println("----------------------------------");
                    for (Account account1 : accounts)
                        System.out.println(account1);
                    System.out.println("----------------------------------");
                    break;

            }
        }
    }
}
