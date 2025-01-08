package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class ReverseOfANumberAndSumOfIItsDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        int reverse = 0;
        int sum = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            number /= 10;
        }
        System.out.println("Reversed: " + reverse);
        System.out.println("Sum of digits: " + sum);
    }
}
