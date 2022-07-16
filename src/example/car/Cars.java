package example.car;

public class Cars {
    private String model;
    private String color;
    private Integer dateIn;
    private Integer maxSpeed;

    public Cars(String model, String color, Integer dateIn, Integer maxSpeed) {
        this(model, color, dateIn);
        this.maxSpeed = maxSpeed;
        System.out.println("Barcha parametr bo'yicha ishladi");
    }

    public Cars(String model, String color, Integer dateIn) {
        this();
        this.model = model;
        this.color = color;
        this.dateIn = dateIn;
        System.out.println();
        System.out.println("3 ta parametrli constructor chaqirildi");
    }

    public Cars() {
        System.out.println("Default constructor chaqirildi");
    }
}
