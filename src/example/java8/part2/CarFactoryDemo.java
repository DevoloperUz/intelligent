package example.java8.part2;

public class CarFactoryDemo {

    CarFactory carFactory = (VIN, model, color, price) -> new Car("1@!4214", "Chevrolet", "Black", 20000.0);

}
