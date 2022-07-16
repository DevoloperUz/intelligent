package example.java8.part2;

import java.util.UUID;

public class Car {
    private final UUID ID = UUID.randomUUID();
    private final String VIN;
    private String model;
    private String color;
    private Double price;

    public Car(String VIN, String model, String color, Double price) {
        this.VIN = VIN;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public UUID getID() {
        return ID;
    }

    public String getVIN() {
        return VIN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", VIN='" + VIN + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
