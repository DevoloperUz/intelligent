package example.polymorphism;

public class ShapeDemo {
    public static void main(String[] args) {
        /*Shape shape = new Shape();
        Circle circle = new Circle();

        shape.info();
        circle.info();*/

        Shape[] shapes = new Shape[2];

        shapes[0] = new Shape();
        shapes[1] = new Circle();

        for (Shape shape : shapes) {
            shape.info();
        }
    }
}
