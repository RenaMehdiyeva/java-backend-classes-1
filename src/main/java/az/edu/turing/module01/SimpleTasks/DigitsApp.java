package az.edu.turing.module01.SimpleTasks;

import java.util.Scanner;

public class DigitsApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numberOfDigits = String.valueOf(n).length();
        System.out.println(numberOfDigits);
    }
}