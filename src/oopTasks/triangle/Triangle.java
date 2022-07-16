package oopTasks.triangle;

public class Triangle {

    int smallSide;
    int bigSide;
    int hypotenuse;

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    // To'g'ri burchakli Uchburchak Peimetrini Hisoblovchi Metod

    public int perimeter(int smallSide, int bigSide, int hypotenuse){
        return smallSide + bigSide + hypotenuse;
    }

    // To'g'ri burchakli uchburchak yuzasini hisoblovchi metod

    public int area(int smallSide, int bigSide) {
        return (smallSide * bigSide) / 2;
    }

}
