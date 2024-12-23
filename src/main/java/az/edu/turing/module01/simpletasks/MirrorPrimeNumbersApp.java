package az.edu.turing.module01.simpletasks;

import java.util.Scanner;

public class MirrorPrimeNumbersApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isPrime(reverseNumber(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    private static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
}

