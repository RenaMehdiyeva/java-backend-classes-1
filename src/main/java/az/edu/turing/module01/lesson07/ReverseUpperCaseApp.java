package az.edu.turing.module01.lesson07;

import java.util.Scanner;

public class ReverseUpperCaseApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String word = scanner.nextLine();
        String reverseUpperCaseWord = new StringBuilder(word).reverse().toString().toUpperCase();
        System.out.println("Reversed and uppercased word: " + reverseUpperCaseWord);
    }
}
