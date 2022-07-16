package example.abstraction.employee;

public class PayrollSystem {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("G'iyosbek", "Qo'ziyev", "123-123-123", 800.0);
        ComissionEmployee comissionEmployee = new ComissionEmployee("Xusan", "Sharipov", "123-123-124", 1000.0, .6);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Kamron", "Sobirov", "123-123-125", 15.0, 135.0);

        Employee[] employees = new Employee[3];
        employees[0] = salariedEmployee;
        employees[1] = comissionEmployee;
        employees[2] = hourlyEmployee;

        for (Employee employee : employees) {
            System.out.println(employee.toString() + "\n");
        }
    }
}
