package az.edu.turing.module01.tasks2;

import java.util.Scanner;

public class ValueOfVariable3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        double numerator1 = x * x + 3 * x - 4;
        double denominator1 = 2 * x - 3;
        double fraction1 = numerator1 / denominator1;

        double numerator2 = x + 2;
        double denominator2 = x * x - 5 * x + 7;
        double fraction2 = numerator2 / denominator2;

        double y = fraction1 - fraction2;

        System.out.printf("%.3f%n", y);
    }
}
