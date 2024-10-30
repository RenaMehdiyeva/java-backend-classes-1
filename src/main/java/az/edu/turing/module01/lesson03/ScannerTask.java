package az.edu.turing.module01.lesson03;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: \t");
        int number = scan.nextInt();
        System.out.println("Number is: " + number);
        System.out.print("Even true, odd false: \t");
        System.out.print(number % 2 == 0 && true || false);

    }
}