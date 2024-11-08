package az.edu.turing.module01.lesson07;

import java.util.Scanner;

public class LastCharacterApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String word = scanner.nextLine();
        char lastChar = word.charAt(word.length() - 1);
        System.out.println("The last char is: " + lastChar);
    }
}
