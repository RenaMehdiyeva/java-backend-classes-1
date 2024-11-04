package az.edu.turing.module01.eolymp;

import java.util.Scanner;

public class MedianNumberApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int median;
        if ((a > b && a < c) || (a > c && a < b)) {
            median = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            median = b;
        } else {
            median = c;
        }
        System.out.println(median);
    }
}
