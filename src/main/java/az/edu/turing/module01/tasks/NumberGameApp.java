package az.edu.turing.module01.tasks;

import java.util.Scanner;
import java.util.Random;

public class NumberGameApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int hiddenNumber = random.nextInt(101);
        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        int[] attempts = new int[100];
        int attemptsCount = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            int playerGuess;

            while (true) {
                if (scanner.hasNextInt()) {
                    playerGuess = scanner.nextInt();
                    attempts[attemptsCount++] = playerGuess;
                    break;
                }else {
                    System.out.print("Invalid input. Please enter a valid number: ");
                    scanner.next();
                }
            }
            if (playerGuess < hiddenNumber) {
                System.out.println("Your number is too small. Please, try again..");
            }else if (playerGuess > hiddenNumber) {
                System.out.println("Your number is too big. Please, try again..");
            }else {
                System.out.println("Congratulations, " + playerName + "!");
                break;
            }
        }
        System.out.print("Your numbers: ");
        sortArrayDesc(attempts, attemptsCount);
        for (int i = 0; i < attemptsCount; i++) {
            System.out.print(attempts[i] + " ");
        }
    }
    private static void sortArrayDesc(int[] array, int length) {
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
