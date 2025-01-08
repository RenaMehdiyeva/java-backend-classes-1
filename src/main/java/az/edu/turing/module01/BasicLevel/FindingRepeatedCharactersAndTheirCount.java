package az.edu.turing.module01.BasicLevel;

import az.edu.turing.module01.lesson03.ScannerTask;

import java.util.Scanner;

public class FindingRepeatedCharactersAndTheirCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] charCount = new int[256];

        for (char c : input.toCharArray()) {
            charCount[c]++;
        }
        System.out.println("Repeated characters and their count:");

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}
