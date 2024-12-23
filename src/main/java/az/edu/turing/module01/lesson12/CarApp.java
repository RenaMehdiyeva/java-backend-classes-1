package az.edu.turing.module01.lesson12;

public class CarApp {
    public static void main(String[] args) {
        Car tesla = new ElectricCar("Tesla");
        tesla.displayBrand();
        tesla.sound();
        tesla.move();
        tesla.stop();

        System.out.println();

        Car ferrari = new SportsCar("Ferrari");
        ferrari.displayBrand();
        ferrari.sound();
        ferrari.move();
        ferrari.stop();
    }
}
