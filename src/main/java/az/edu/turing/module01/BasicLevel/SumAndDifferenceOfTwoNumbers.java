package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class SumAndDifferenceOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
