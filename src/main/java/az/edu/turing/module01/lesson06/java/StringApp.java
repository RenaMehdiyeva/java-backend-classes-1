package az.edu.turing.module01.lesson06.java;

public class StringApp {
    public static void main(String[] args) {

        String name1 = "Turing";
        String name2 = "TURING";
        String name3 = new String("TURING");
        String name4 = new String("Turing");
        System.out.println(name1.equalsIgnoreCase(name3));
    }
}
