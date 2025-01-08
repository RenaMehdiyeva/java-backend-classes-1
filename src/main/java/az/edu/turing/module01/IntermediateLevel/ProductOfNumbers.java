package az.edu.turing.module01.IntermediateLevel;

import java.util.Scanner;

public class ProductOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int count = scanner.nextInt();

        int product = 1;
        System.out.println("Enter the integers:");

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            product *= number;
        }
        System.out.println("Product of the numbers: " + product);
    }
}
