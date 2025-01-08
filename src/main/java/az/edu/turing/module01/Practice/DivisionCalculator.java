package az.edu.turing.module01.Practice;

//Handle a divide-by-0 exception

import java.util.Scanner;

public class DivisionCalculator {

    public static double divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot be divided by 0!");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the divisible number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the divisor number: ");
            int denominator = scanner.nextInt();

            double result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: You can only enter a number!");
        }
    }
}
