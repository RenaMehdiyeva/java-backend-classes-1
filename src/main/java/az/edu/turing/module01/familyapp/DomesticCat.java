package az.edu.turing.module01.familyapp;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.DOMESTICCAT, nickname, age, trickLevel, habits);
    }

    public Species getSpecies() {
        return Species.DOMESTICCAT;
    }

    @Override
    public void respond() {
        System.out.println("Meow! Hello, owner. I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up...");
    }
}