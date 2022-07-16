package example.inheritance;

public class Book {
    protected String title;
    protected Integer yearOfPublished;
    protected Double price;

    public Book() {
    }

    public Book(String title, Integer yearOfPublished, Double price) {
        this.title = title;
        this.yearOfPublished = yearOfPublished;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYearOfPublished() {
        return yearOfPublished;
    }

    public Double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublished(Integer yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void printReport () {
        System.out.printf("Name:\n\n%s\n Year of published: %s\n Price: $%s\n\n", this.title, this.yearOfPublished, this.price);
    }
}
