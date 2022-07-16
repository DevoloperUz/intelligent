package extraTasks.onlineshop;

import java.util.Scanner;

public class OnlineShopp {
   public static Scanner scanner = new Scanner(System.in);
   public static Product[] products = new Product[1000];
   public static Integer index = 0;

    public static void main(String[] args) {

        System.out.printf("%n ---------     Online do'konimizga xush kelibsiz!     -------- %n ");
        System.out.printf("%n %n Omborda mahsulot yo'q, iltimos oldin kiriting! %n");

        boolean exit = false;
        while (!exit) {

            System.out.println("Continue? y - yes, n - no");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("n"))
                exit = true;

            if (!exit) {
                storeData();
            }
        }


    }

    private static void storeData() {
        System.out.printf("%n Mahsulot turi: ");
        String typeProduct = scanner.nextLine();

        System.out.printf("%n Mahsulot nomi: ");
        String nameProduct = scanner.nextLine();

        System.out.printf("%n Mahsulot narxi: ");
        Integer priceProduct = scanner.nextInt();

        System.out.printf("%n Mahsulot miqdori: ");
        Integer amountProduct = scanner.nextInt();

        System.out.printf("%n Mahsulot o'lchov birligi (ta, kg, litr...): ");
        String size = scanner.nextLine();

        System.out.printf(" %n %n %n ");

        products[index++] = new Product(typeProduct, nameProduct, priceProduct, amountProduct, size);

        System.out.println(nameProduct + " omborga qo'shildi! ");
    }
}
