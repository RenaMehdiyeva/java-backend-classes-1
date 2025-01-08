package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class FibonacciSequenceAndSumOfElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int first = 0, second = 1;
        int sum = 0;

        System.out.print("Fibonacci: [");

        while (first <= number) {
            System.out.print(first);
            sum += first;

            if (second <= number) {
                System.out.print(", ");
            }

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println("]");
        System.out.println("Sum: " + sum);
    }
}
