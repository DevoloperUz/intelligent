package example.interfacee;

public class Airplane implements SwitchableInterface, Flying {
    private String name;
    private String typeOfEngine;
    private String action;
    private String flyAction;

    public Airplane(String name, String typeOfEngine) {
        this.name = name;
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public void fly() {
    this.flyAction = "Uchdi";
    }

    @Override
    public void land() {
    this.flyAction = "Qo'ndi";
    }

    @Override
    public void switchOn() {
        System.out.printf("Airplane: %s\nEngine: %s\nAction status: %s\n\n", this.name, this.typeOfEngine, "Switch On");
    }

    @Override
    public void switchOff() {
        System.out.printf("Airplane: %s\nEngine: %s\nAction status: %s\n", this.name, this.typeOfEngine, "Switch Off");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        return String.format("Airplane: %s\nEngine: %s\nAction status: %s\nFly Action: %s", this.name, this.typeOfEngine, this.action, this.flyAction);
    }
}
