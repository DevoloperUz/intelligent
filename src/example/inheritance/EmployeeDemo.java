package example.inheritance;

public class EmployeeDemo {
    public static void main(String[] args) {
        ComissionEmployee comissionEmployee = new ComissionEmployee("G'iyosbek", "Qo'ziyev",
                "GK0083131", 1000.0, 0.8);
        System.out.println(comissionEmployee);
        System.out.println(comissionEmployee.sofFoyda());
    }

    PlusComissionEmployee plusComissionEmployee = new PlusComissionEmployee("G'iyosbek", "Qo'ziyev",
            "GK0083131", 1000.0, .8);
}
