package oopTasks.point;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point();

        point.setX(45);
        point.setY(56);

        System.out.println(point.printXY(point.getX(), point.getY()));
    }
}
