package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class SumAndAmountApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int count = 0;
        int sum = 0;

        for (String number : numbers) {
            int value = Integer.parseInt(number);
            sum += value;
            count++;
        }
        System.out.println(count + " " + sum);
    }
}