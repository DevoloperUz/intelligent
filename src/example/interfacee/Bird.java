package example.interfacee;

public class Bird implements Flying {
    private String action;

    @Override
    public void fly() {
        this.action = "Uchdi";
    }

    @Override
    public void land() {
        this.action = "Qo'ndi";
    }

    @Override
    public String toString() {
        return "Bird{" +
                "action='" + action + '\'' +
                '}';
    }
}
