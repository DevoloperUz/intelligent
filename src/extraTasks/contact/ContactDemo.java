package extraTasks.contact;

import java.util.Scanner;

public class ContactDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contact contact = new Contact();
        Contact[] contacts = new Contact[10];
        contacts[0] = new Contact(1, contact.getPhoneNumber(), contact.getName(), contact.getAdress(), contact.getMail());

        // kontaktlarni massivga joylash?
        boolean a = true;
        while (a) {
            System.out.println(" ---------     MENU      --------- ");
            System.out.println(" 1. Kontakt qo'shish ");
            System.out.println(" 2. O'zgartirish ");
            System.out.println(" 3. O'chirish ");
            System.out.println(" 0. Chiqish ");

            int num = scanner.nextInt();

            switch (num) {

                case 1:
                    System.out.println(" Tel nomer kiriting( 9 lik formatda!): ");
                    int phoneNum = scanner.nextInt();
                    contact.setPhoneNumber(phoneNum);

                    scanner = new Scanner(System.in);

                    System.out.println(" Ism: ");
                    String name = scanner.nextLine();
                    contact.setName(name);

                    System.out.println(" Manzil: ");
                    String adress = scanner.nextLine();
                    contact.setAdress(adress);

                    System.out.println(" Email: ");
                    String email = scanner.nextLine();
                    contact.setMail(email);

                    System.out.println(" Kontakt qo'shildi! ");
                    System.out.println(" ID: " + contact.getId() + "; Ism: " + contact.getName() + "; Manzil: " + contact.getAdress() + "; Tel: +998" + contact.getPhoneNumber() + "; Email: " + contact.getMail());

                    boolean b = true;
                    while (b) {
                        System.out.println(" Yana kontakt qo'shasizmi? ");
                        System.out.println(" 1. Ha ");
                        System.out.println(" 2. Yo'q ");

                        int n = scanner.nextInt();
                        switch (n) {
                            case 1:
                                System.out.println(" Tel nomer kiriting( 9 lik formatda!): ");
                                int phoneNumber = scanner.nextInt();
                                contact.setPhoneNumber(phoneNum);

                                scanner = new Scanner(System.in);

                                System.out.println(" Ism: ");
                                String contactName = scanner.nextLine();
                                contact.setName(name);

                                System.out.println(" Manzil: ");
                                String contactAdress = scanner.nextLine();
                                contact.setAdress(adress);

                                System.out.println(" Email: ");
                                String contactEmail = scanner.nextLine();
                                contact.setMail(email);

                                // id nomer berish kontaktlarga?
                                System.out.println(" Kontakt qo'shildi! ");
                                System.out.println(" ID: " + contact.getId() + "; Ism: " + contact.getName() + "; Manzil: " + contact.getAdress() + "; Tel: +998" + contact.getPhoneNumber() + "; Email: " + contact.getMail());

                                break;
                            case 2:
                                b = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println(" Kontaktni tanlang: ");
                    // kontaklar ro'yxatini chiqarish?

                    System.out.println(" 1. Tel ");
                    System.out.println(" 2. Manzil ");
                    System.out.println(" 3. Ism ");
                    System.out.println(" 4. Email ");

                    scanner = new Scanner(System.in);
                    int m = scanner.nextInt();

                    switch (m) {

                    }
                    break;
                case 3:
                    // kontakni o'chirish?
                    break;
                case 0:
                    System.out.println(" Tashrifingiz uchun rahmat! ");
                    a = false; // false qilinganda break yozish shartmi?
                    break;
            }
        }

    }
}
