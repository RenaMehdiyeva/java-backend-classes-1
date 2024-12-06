package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class Function5App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long z = scanner.nextLong();
        long result = (x * y * z) + x + (y * y) + (z * z * z);


        System.out.println(result);
    }
}