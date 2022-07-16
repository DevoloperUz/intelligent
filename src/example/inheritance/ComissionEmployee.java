package example.inheritance;

public class ComissionEmployee {
    protected String firstName;
    protected String lastName;
    protected final String ssn; // social security number
    protected Double groosSales; // umumiy foyda
    protected Double comissionRate; // komissionniy foiz

    public ComissionEmployee(String firstName, String lastName, String ssn, Double groosSales, Double comissionRate) {

        if (groosSales < 0)
            throw new IllegalArgumentException("Groos sales must be positive!");
        if (comissionRate <= 0 || comissionRate > 1)
            throw new IllegalArgumentException("Comission rate must be > 0 and < 1!");

        this.groosSales = groosSales;
        this.comissionRate = comissionRate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public Double getGroosSales() {
        return groosSales;
    }

    public void setGroosSales(Double groosSales) {
        if (groosSales < 0)
            throw new IllegalArgumentException("Groos sales must be positive!");

        this.groosSales = groosSales;
    }

    public Double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(Double comissionRate) {
        if (comissionRate <= 0 || comissionRate > 1)
            throw new IllegalArgumentException("Comission rate must be > 0 and < 1!");

        this.comissionRate = comissionRate;
    }
    // komiisiya puli topish
    public Double sofFoyda () {
        return (groosSales - (groosSales * comissionRate));
    }

    public static void showInfo() {
        System.out.println("I'm static method");
    }

    @Override
    public String toString() {
        return "ComissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", groosSales= $" + groosSales +
                ", comissionRate=" + comissionRate +
                '}';
    }
}
