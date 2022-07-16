package example.abstraction.employee;

public class HourlyEmployee extends Employee{
    private double wage;  //soatiga qancha to'lanishi
    private double hours;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        if (wage < 0)
            throw new IllegalArgumentException("Wage must be positive!");
        this.wage = wage;
        if (hours < 0)
            throw new IllegalArgumentException("Hours must be positive!");
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (this.hours <= 40)
            return this.wage * this.hours;
        else
            return ((40 * this.wage) + ((this.hours - 40) * this.wage * 1.5));
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s\nHourly wage: %s\nHours: %s\nEarnings: %s", super.toString(), getWage(), getHours(), earnings());
    }
}
