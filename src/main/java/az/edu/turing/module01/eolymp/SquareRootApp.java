package az.edu.turing.module01.eolymp;

import java.util.Scanner;

public class SquareRootApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int sumOfDigits = hundreds + tens + units;

        double squareRoot = Math.sqrt(sumOfDigits);

        System.out.printf("%.3f%n", squareRoot);
    }
}

