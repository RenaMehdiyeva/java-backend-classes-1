package az.edu.turing.module01.lesson12;

abstract class Car implements Vehicle {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    abstract void sound();
}
