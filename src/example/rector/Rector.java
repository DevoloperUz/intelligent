package example.rector;

public class Rector {
    // Final variable ga qiymat berish

    public final int ID = (int) (Math.random() * 10);

    public final String RECTOR_NAME;

    // Constructor orqali
   /* public Rector() {
        this.RECTOR_NAME = " Mirzohid ";
    }*/

    // Logical Blok ichida qiymat berish
    {
        this.RECTOR_NAME = " Mirzohid ";
    }

    public boolean checkRights(final int num) {
        final int code = 12356;

        if (num == code)
            return true;
        else
            return false;
    }
}
