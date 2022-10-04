package Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void accelerate() {
        System.out.println("Car -> accelerate()");
    }

    public void brake() {
        System.out.println("Car -> brake()");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}
