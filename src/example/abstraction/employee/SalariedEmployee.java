package example.abstraction.employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        if (weeklySalary < 0)
            throw new IllegalArgumentException(" Weekly salary must be > 0.0 ");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0)
            throw new IllegalArgumentException(" Weekly salary must be > 0.0 ");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s\nAmount of weekly salary: $%.2f", super.toString(), this.weeklySalary);
    }
}
