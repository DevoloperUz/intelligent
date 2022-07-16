package example.inheritance;

public class BookInspector {
    public static void main(String[] args) {
        /*Book book = new Book(" O'tkan kunlar ", 2010, 5.0 );
        ProgrammerBook programmerBook = new ProgrammerBook(" Java ", 2006, 45.0, " Junior ");

        book.printReport();
        programmerBook.printReport();*/

        Book[] books = new Book[4];
        books[0] = new Book("O'tkan kunlar", 2010, 5.0);
        books[1] = new ProgrammerBook("Java", 2020, 50.0, "High");
        books[2] = new Book("Yulduzli tunlar", 2005, 20.0);
        books[3] = new ProgrammerBook("Methods in Java", 2022, 70.0, "Junior");

        report2(books);
    }

    private static void report(Book[] books) {
        for (Book book : books)
            book.printReport();
    }

    private static void report2 (Book[] books) {
        Book book;
        ProgrammerBook programmerBook;

        for (Book item : books) {
            if (item instanceof ProgrammerBook) {
                ProgrammerBook programmerBook1 = (ProgrammerBook) item;
                System.out.println(" Programmer level: " + programmerBook1.getLevel());
            }else {
                Book book1 = (Book) item;
                System.out.println("Book Price: " + item.getPrice());
            }
        }
    }
}
