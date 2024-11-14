package az.edu.turing.module01.tasks;

import java.util.Scanner;
import java.util.Random;

public class ShootingAtTheSquareApp{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int size = 5;
        char[][] field = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = '-';
            }
        }
        int targetRow = random.nextInt(size);
        int targetCol = random.nextInt(size);

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            int row = getUserInput(scanner, "Enter row (1-5): ", size) - 1;
            int col = getUserInput(scanner, "Enter column (1-5): ", size) - 1;

            if (row == targetRow && col == targetCol) {
                field[row][col] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            }else {
                field[row][col] = '*';
                printField(field);
            }
        }
    }
    private static int getUserInput(Scanner scanner, String prompt, int size) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= size) {
                    break;
                }else {
                    System.out.println("Please enter a number within the range (1-5).");
                }
            }else {
                System.out.println("Invalid input. Enter a number.");
                scanner.next();
            }
        }
        return input;
    }
    private static void printField(char[][] field) {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < field.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}