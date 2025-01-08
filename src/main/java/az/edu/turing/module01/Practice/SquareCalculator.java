package az.edu.turing.module01.Practice;

//Calculate the square of a number entered by the user

import java.util.Scanner;

public class SquareCalculator {

    public static int getSquare(String input) throws NumberFormatException {
        int number = Integer.parseInt(input);
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        String userInput = scanner.nextLine();

        try {
            int square = getSquare(userInput);
            System.out.println("The square of the number you entered:: " + square);
        } catch (NumberFormatException e) {
            System.out.println("Error: You can only enter a number!");
        }
    }
}

