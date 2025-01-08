package az.edu.turing.module01.FamilyApp;

public class RoboCat extends Pet {
    public RoboCat(String nickname, int age) {
        super(Species.ROBOCAT, nickname, age, 100, new String[]{"meow", "purr"});
    }

    public Species getSpecies() {
        return Species.ROBOCAT;
    }

    @Override
    public void respond() {
        System.out.println("Beep boop! Hello, master.");
    }

    @Override
    public void foul() {
        System.out.println("I don't need to cover anything.");
    }
}