package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class ArithmeticalMeanApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int sum = 0;

        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        double mean = (double) sum / numbers.length;
        System.out.printf("%.4f\n", mean);
    }
}