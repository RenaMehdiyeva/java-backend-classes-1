package az.edu.turing.module01.tasks;

import java.util.Scanner;
import java.util.Random;

public class NumberGameApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(101);
        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int[] guesses = new int[100];
        int guessCount = 0;
        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess;

            while (true) {
                if (scanner.hasNextInt()) {
                    userGuess = scanner.nextInt();
                    break;
                } else {
                    System.out.print("Invalid input. Please enter a valid number: ");
                    scanner.next();
                }
            }

            if (userGuess < targetNumber) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (userGuess > targetNumber) {
                System.out.println("Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
        System.out.print("Your numbers: ");
        sortDescending(guesses, guessCount);
        for (int i = 0; i < guessCount; i++) {
            System.out.print(guesses[i] + " ");
        }
    }

    private static void sortDescending(int[] array, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}