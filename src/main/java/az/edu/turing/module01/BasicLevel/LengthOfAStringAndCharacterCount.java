package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class LengthOfAStringAndCharacterCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        int length = input.length();

        int[] charCount = new int[256];

        for (char c : input.toCharArray()) {
            charCount[c]++;
        }
        System.out.println("Length: " + length);

        System.out.println("Number of letters: ");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}

