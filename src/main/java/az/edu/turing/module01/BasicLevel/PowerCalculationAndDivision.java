package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class PowerCalculationAndDivision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = scanner.nextInt();

        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt();

        int power = (int) Math.pow(base, exponent);

        double division = (double) base / exponent;

        System.out.println("Power: " + power);
        System.out.printf("Division: %.2f%n", division);
    }
}
