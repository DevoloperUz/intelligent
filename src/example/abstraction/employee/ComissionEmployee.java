package example.abstraction.employee;

public class ComissionEmployee extends Employee{
    private double grossSale;
    private double comissioneRate;

    public ComissionEmployee(String firstName, String lastName, String ssn, double grossSale, double comissioneRate) {
        super(firstName, lastName, ssn);
        this.grossSale = grossSale;
        this.comissioneRate = comissioneRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getComissioneRate() {
        return comissioneRate;
    }

    public void setComissioneRate(double comissioneRate) {
        this.comissioneRate = comissioneRate;
    }

    @Override
    public double earnings() {
        return this.comissioneRate * this.grossSale;
    }

    @Override
    public String toString() {
        return String.format("Comission Employee: %s\nGross Sale: %s\nComission Rate: %s\nEarning: %.2f",super.toString(), getGrossSale(), getComissioneRate(), earnings());
    }
}
