package example.inheritance;

public class ProgrammerBook extends Book {
    private String level;

    public ProgrammerBook() {
    }

    public ProgrammerBook(String title, Integer yearOfPublished, Double price, String level) {
        super(title, yearOfPublished, price);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void printReport () {
        System.out.printf(" Name:%s\n Year of published: %s\n Price: $%s\n Level: %s" , this.title, this.yearOfPublished, this.price, this.level);
    }
}
