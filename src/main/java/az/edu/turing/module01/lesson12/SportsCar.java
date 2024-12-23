package az.edu.turing.module01.lesson12;

public class SportsCar extends Car {
    public SportsCar(String brand) {
        super(brand);
    }

    void sound() {
        System.out.println("Sports car sound: Vroom Vroom!");
    }

    public void move() {
        System.out.println("Sports car is speeding...");
    }

    public void stop() {
        System.out.println("Sports car is stopping...");
    }
}
