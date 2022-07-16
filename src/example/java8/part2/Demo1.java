package example.java8.part2;

public class Demo1 {
    public static void main(String[] args) {
/*
        // LAMBDA - check odd number
    Expression<Integer> checkOdd = data -> data % 2 == 1;

    // LAMBDA - check even number
    Expression<Integer> checkEven = data -> data % 2 == 0;

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    showOdd(numbers, checkOdd);

    showEven(numbers, checkEven);
}

    private static void showEven(int[] numbers, Expression<Integer> checkEven) {
        for (int num : numbers) {
            if (checkEven.isEqual(num))
                System.out.print(num + ", ");
        }

    }

    private static void showOdd(int[] numbers, Expression<Integer> expression) {
        for (int number : numbers) {
            if (expression.isEqual(number))
                System.out.print(number + ", ");
        }
        System.out.println();*/

        Expression<Car> carExpression = data ->
                data.getPrice() < 6000 &&
                        data.getModel().equalsIgnoreCase("Chevrolet");

        Car[] cars = {
                new Car("XWB456456", "BMW", "Black", 25000.0),
                new Car("XWB456457", "Chevrolet", "White", 5600.0),
                new Car("XWB456458", "BMW", "Black", 30000.0),
                new Car("XWB456459", "Chevrolet", "Red", 5800.0),
                new Car("XWB456460", "BMW", "Black", 35000.0),
                new Car("XWB456460", "Chevrolet", "Chocolate", 5000.0)
        };

        showCarnfoDate(cars, carExpression);


    }

    private static void showCarnfoDate(Car[] cars, Expression<Car> carExpression) {

        for (Car car : cars) {
            if (carExpression.isEqual(car))
                System.out.println(car);
        }
    }
}
