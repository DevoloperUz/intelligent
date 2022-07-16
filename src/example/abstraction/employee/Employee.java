package example.abstraction.employee;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String ssn;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return String.format("%s %s ssn: %s", this.firstName, this.lastName, this.ssn);
    }

    public abstract double earnings();
}
