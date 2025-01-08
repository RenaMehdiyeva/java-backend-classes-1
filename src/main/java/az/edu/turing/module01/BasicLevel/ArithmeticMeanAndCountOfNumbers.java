package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class ArithmeticMeanAndCountOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int sum = 0;

        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / count;

        System.out.println("Average: " + average);
        System.out.println("Count: " + count);
    }
}
