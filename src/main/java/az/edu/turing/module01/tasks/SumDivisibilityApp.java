package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class SumDivisibilityApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        long sum = 0;
        int n = 0;

        while (true) {
            n++;
            sum += n;
            if (sum % k == 0) {
                break;
            }
        }
        System.out.println(n);
    }
}

