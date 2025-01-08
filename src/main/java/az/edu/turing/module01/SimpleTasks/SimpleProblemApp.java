package az.edu.turing.module01.SimpleTasks;

import java.util.Scanner;

public class SimpleProblemApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.print(number / 10);
        System.out.print(" ");
        System.out.print(number % 10);
    }
}
