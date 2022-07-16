package example.abstraction;

public abstract class Abstraction {
    private String name;

    public Abstraction(String name) {
        this.name = name;
    }

    public abstract void draw();

    public void info() {
        System.out.println(" Abstraction ");
    }

}
