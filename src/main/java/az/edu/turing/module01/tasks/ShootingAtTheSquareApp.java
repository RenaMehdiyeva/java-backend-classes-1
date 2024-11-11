package az.edu.turing.module01.tasks;

import java.util.Scanner;
import java.util.Random;

public class ShootingAtTheSquareApp {

    public static void main(String[] args) {

        final int SIZE = 5;
        char[][] field = new char[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = '-';
            }
        }
        int targetRow = random.nextInt(SIZE);
        int targetCol = random.nextInt(SIZE);
        System.out.println("All set. Get ready to rumble!");

        while (true) {
            int row = getValidInput(scanner, "Enter row (1-5): ", SIZE) - 1;
            int col = getValidInput(scanner, "Enter column (1-5): ", SIZE) - 1;

            if (row == targetRow && col == targetCol) {
                field[row][col] = 'x';
                displayField(field);
                System.out.println("You have won!");
                break;
            } else if (field[row][col] == '*') {
                System.out.println("You already shot here. Try again.");
            } else {
                field[row][col] = '*';
                displayField(field);
            }
        }
    }
    private static int getValidInput(Scanner scanner, String prompt, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= max) {
                    return input;
                } else {
                    System.out.println("Please enter a number between 1 and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    private static void displayField(char[][] field) {
        System.out.println("  1  2  3  4  5");
        for (int i = 0; i < field.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }
}