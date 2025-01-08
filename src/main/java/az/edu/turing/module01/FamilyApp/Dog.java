package az.edu.turing.module01.FamilyApp;

public class Dog extends Pet {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.DOG, nickname, age, trickLevel, habits);
    }

    public Species getSpecies() {
        return Species.DOG;
    }

    @Override
    public void respond() {
        System.out.println("Woof! Hello, owner. I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up...");
    }
}
