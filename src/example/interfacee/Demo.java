package example.interfacee;

public class Demo {
    public static void main(String[] args) {
        /*Airplane airplane = new Airplane("Boeing-777", "Eng123");
        airplane.switchOn();
        airplane.switchOff();
        System.out.println(airplane);*/

        /*SwitchableInterface switchableInterface = new Airplane("Boeing-777", "Eng123");
        switchableInterface.switchOn();
        switchableInterface.switchOff();*/

        Flying flying1 = new Airplane("Boeing-777", "Eng123");
        Flying flying2 = new Bird();

        flying1.fly();
        flying2.fly();

        System.out.println(flying1);
        System.out.println(flying2);

        var sum = 124;

    }
}
