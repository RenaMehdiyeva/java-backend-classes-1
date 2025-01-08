package az.edu.turing.module01.FamilyApp;

public class Fish extends Pet {
    public Fish(String nickname, int age) {
        super(Species.FISH, nickname, age, 0, new String[]{"swim"});
    }

    public Species getSpecies() {
        return Species.FISH;
    }

    @Override
    public void respond() {
        System.out.println("...");
    }

    @Override
    public void foul() {
        System.out.println("I don't need to cover anything.");
    }
}