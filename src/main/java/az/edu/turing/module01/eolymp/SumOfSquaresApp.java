package az.edu.turing.module01.eolymp;

import java.util.Scanner;

public class SumOfSquaresApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long result = (long)a * a + (long)b * b;
        System.out.println(result);
    }
}
