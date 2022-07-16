package extraTasks.invoice;

import java.util.Scanner;

public class InvoiceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Invoice invoice1 = new Invoice(" 742 - 0001 ", 150, false);
        Invoice invoice2 = new Invoice(" 742 - 0002 ", 250, false);
        Invoice invoice3 = new Invoice(" 742 - 0003 ", 350, false);
        Invoice invoice4 = new Invoice(" 742 - 0004 ", 450, false);
        Invoice invoice5 = new Invoice(" 742 - 0005 ", 550, false);

        Invoice[] invoices = new Invoice[5];
        invoices[0] = invoice1;
        invoices[1] = invoice2;
        invoices[2] = invoice3;
        invoices[3] = invoice4;
        invoices[4] = invoice5;

        while (true) {
            System.out.println(" ----------     OPERATSIYALAR     --------- ");
            System.out.println("1. Invoice lar");
            System.out.println("2. Invoice ga to'lov qilish");
            System.out.println("3. Invoice xolati");
            System.out.println("0. Chiqish");

            System.out.println(" Tanlang: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    for (Invoice invoice : invoices)
                        System.out.println(invoice);
                    break;

                case 2:
                    System.out.println(" Invoice nomerini kiriting: ");
                    scanner = new Scanner(System.in);
                    String invNum = scanner.nextLine();
                    for (Invoice invoice : invoices) {
                        if (invoice.getINVOICE_NUMBER().contains(invNum)) {
                            System.out.println(" Invoice raqami: " + invoice.getINVOICE_NUMBER() + ", Tolanishi kerak bo'lgan mablag': " + invoice.getCost() + ", To'lov holati: " + invoice.isStatus() + ", Oxirgi to'lovchi: " + invoice.getPaidBy());
                            boolean b = true;
                            while (b) {
                                System.out.println(" To'lovchi ism va familiyasi: ");
                                String fullName = scanner.nextLine();
                                invoice.setPaidBy(fullName);
                                System.out.println(" O'tkazmoqchi bo'lgan mablag'ingiz miqdori: ");
                                scanner = new Scanner(System.in);
                                int amount = scanner.nextInt();
                                if (amount < 0)
                                    System.out.println(" Mablag' miqdori manfiy bo'lishi mumkin emas! Qayta kiriting: ");
                                else if (amount == 0)
                                    System.out.println(" Invoice raqami: " + invoice.getINVOICE_NUMBER() + ", Tolanishi kerak bo'lgan mablag': " + invoice.getCost() + ", To'lov holati: " + invoice.isStatus() + ", Oxirgi to'lovchi: " + invoice.getPaidBy());
                                else {
                                    invoice.setCost(invoice.getCost() - amount);
                                    if (invoice.getCost() == 0)
                                        System.out.println(" To'lov to'liq to'landi! ");
                                    else
                                        System.out.println(" To'lov qisman qoplandi! ");

                                    b = false;
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println(" Tanlang: ");
                    System.out.println(" 1. 742 - 0001 ");
                    System.out.println(" 2. 742 - 0002 ");
                    System.out.println(" 3. 742 - 0003 ");
                    System.out.println(" 4. 742 - 0004 ");
                    System.out.println(" 5. 742 - 0005 ");
                    scanner = new Scanner(System.in);
                    int num1 = scanner.nextInt();

                    switch (num1) {
                        case 1:
                            System.out.println(invoice1);
                            break;
                        case 2:
                            System.out.println(invoice2);
                            break;
                        case 3:
                            System.out.println(invoice3);
                            break;
                        case 4:
                            System.out.println(invoice4);
                            break;
                        case 5:
                            System.out.println(invoice5);
                            break;
                    }
                        break;
                case 0:
                    return;
            }
        }
    }
}
