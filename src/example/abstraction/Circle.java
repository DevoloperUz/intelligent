package example.abstraction;

public class Circle extends Abstraction {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void draw() {
        info();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Yuzasi: \n" + area);
    }
}
