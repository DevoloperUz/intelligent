package oopTasks.point;

public class Point {
    Integer X;
    Integer Y;

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public String printXY(int X, int Y) {
        String published = X + " , " + Y;
        return published;
    }
}
