package extraTasks.emailApp;

import example.typeCasting.TypeCasting;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User[] users = new User[5];

        users[0] = new User("Shaxboz", "Komilov", "shaxboz@gmail.com", "G123");
        users[1] = new User("Bobur", "Nurullayev", "bobur@gmail.com", "G123");
        users[2] = new User("Muhiddin", "Muzaffarov", "muhiddin@gmail.com", "G123");
        users[3] = new User("Botir", "Hakimov", "botir@gmail.com", "G123");
        users[4] = new User("G'iyosbek", "Qo'ziyev", "giyosbek@gmail.com", "G123");

        // User ma'lumotlarini constructorga kritmasdan dynamic qilish?

            System.out.printf(" Main menu \n1. Creat new gmail account \n2. List of emails \n3. Exit \n");
            int n = scanner.nextInt();

            // yangi yaratilgan gmailni massivga qo'shish?
            switch (n) {
                case 1:
                    System.out.print(" Fullname: ");
                    String fullName = scanner.nextLine();

                    System.out.print(" Enter gmail: ");
                    String gmail = scanner.nextLine();

                    System.out.print(" Enter password: ");
                    String password = scanner.nextLine();

                    System.out.println(" God job! Accout was successfully created! ");

                    break;

                case 2:
                    for (User user : users) {
                        String mail = user.getEmail();
                        System.out.println(mail);
                    }
                    scanner = new Scanner(System.in);
                    System.out.println(" Please enter your gmail: ");
                    String gmail1 = scanner.nextLine();


                    break;

            }
        }
    }
