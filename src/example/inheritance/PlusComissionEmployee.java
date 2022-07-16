package example.inheritance;

public class PlusComissionEmployee extends ComissionEmployee {
    private Double plusSalary;

    public PlusComissionEmployee(String firstName, String lastName, String ssn, Double groosSales, Double comissionRate) {
        super(firstName, lastName, ssn, groosSales, comissionRate);
        if (plusSalary < 0)
            throw new RuntimeException("Plus salary must be positive!");
        this.plusSalary = plusSalary;
    }

    public Double getPlusSalary() {
        return plusSalary;
    }

    public void setPlusSalary(Double plusSalary) {
        if (plusSalary < 0)
            throw new RuntimeException("Plus salary must be positive!");

        this.plusSalary = plusSalary;
    }

    @Override
    public Double sofFoyda() {
            return this.plusSalary * this.groosSales * this.comissionRate;
    }



    @Override
    public String toString() {
        return "PlusComissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", groosSales=" + groosSales +
                ", comissionRate=" + comissionRate +
                ", plusSalary=" + plusSalary +
                '}';
    }
}
