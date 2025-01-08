package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class SumOfOddAndEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter the integers: ");

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
