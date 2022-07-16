package example.car;

public class Car {
    private String model;
    private Integer madeInDate;
    private Integer power;


    public Car(String model, Integer madeInDate, Integer power) {
        this(model, madeInDate);
        this.power = power;
    }

    public Car(String model, Integer madeInDate) {
        this.model = model;
        this.madeInDate = madeInDate;
    }
}
