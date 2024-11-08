package az.edu.turing.module01.lesson07;

import java.util.Scanner;

public class LastCharacterVowelCheckApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String word = scanner.nextLine();
        char lastChar = word.charAt(word.length() - 1);
        System.out.println(isVowel(lastChar) ? "The last character is a vowel." : "The last character is not a vowel.");
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);  // Convert to lowercase for easy comparison
        return "aeiou".indexOf(ch) != -1;
    }
}
