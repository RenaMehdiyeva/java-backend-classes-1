package az.edu.turing.module01.lesson03;

import java.util.Scanner;

public class DataTypeTask {
    public static void main(String[] args) {

        int number1 = 14;
        int number2 = 5;
        int sum = number1 + number2;

        int number3 = 16;
        int number4 = 3;
        int result = number3 - number4;

        int number5 = 21;
        int number6 = 3;
        int fraction = number5 / number6;

        int number7 = 23;
        int number8 = 4;
        int multiply = number7 * number8;

        int number9 = 43;
        int number10 = 6;
        int percent = number9 % number10;

        int number11 = 64;
        int number12 = 5;
        int whole = number11;


        System.out.println("Sum numbers: " + sum);
        System.out.println("Minus numbers: " + result);
        System.out.println("Fraction numbers: " + fraction);
        System.out.println("Multiply numbers: " + multiply);
        System.out.println("Percent numbers: " + percent);
        System.out.println("Whole numbers: " + whole);


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: \t");
        int number = scan.nextInt();
        System.out.println((number % 2 == 1) ? "tek" : "cut ");
    }
}
