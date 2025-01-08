package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class FactorialCalculationAndSumOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int factorial = 1;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            sum += i;
        }
        System.out.println("Factorial: " + factorial);
        System.out.println("Sum: " + sum);
    }
}
