package az.edu.turing.module01.lesson03;

import java.util.Scanner;

public class ScannerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}
