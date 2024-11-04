package az.edu.turing.module01.eolymp;

import java.util.Scanner;

public class MonthlyAndQuarterlyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month >= 1 && month <= 3) {
            System.out.println("First");
        } else if (month >= 4 && month <= 6) {
            System.out.println("Second");
        } else if (month >= 7 && month <= 9) {
            System.out.println("Third");
        } else if (month >= 10 && month <= 12) {
            System.out.println("Fourth");
        } else {
            System.out.println("Invalid month number");
        }
    }
}