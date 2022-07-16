package example.rector;

public class RectorDemo {
    public static void main(String[] args) {
        Rector rector1 = new Rector();
        Rector rector2 = new Rector();
        Rector rector3 = new Rector();

        System.out.println(" rector1 object " + rector1.hashCode() + "  " + rector1.ID);
        System.out.println(" rector2 object " + rector2.hashCode() + "  " + rector2.ID);
        System.out.println(" rector3 object " + rector3.hashCode() + "  " + rector3.ID);


    }
}
