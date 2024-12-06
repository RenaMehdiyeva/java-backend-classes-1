package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class Function4App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long result = 1 + x + (x * x);

        System.out.println(result);
    }
}