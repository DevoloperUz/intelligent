package example.java8.part2;

@FunctionalInterface
public interface CarFactory {

    Car create (String VIN, String model, String color, Double price);
}
