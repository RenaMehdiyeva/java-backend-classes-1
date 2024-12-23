package az.edu.turing.module01.polymorphism;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Bird bird = new Bird();

        animal.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
