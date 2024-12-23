package az.edu.turing.module01.lesson12;

public class ElectricCar extends Car {
    public ElectricCar(String brand) {
        super(brand);
    }
    void sound() {
        System.out.println("Electric car sound: Whirr..");
    }

    @Override
    public void move() {
        System.out.println("Electric car is moving silently..");
    }

    public void stop() {
        System.out.println("Electric car is stopping...");
    }
}
