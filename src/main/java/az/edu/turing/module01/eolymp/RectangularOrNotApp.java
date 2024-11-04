package az.edu.turing.module01.eolymp;

import java.util.Scanner;

public class RectangularOrNotApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a < c) {
            if (a * a == b * b + c * c) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else if (b > a && b > c) {
            if (b * b == a * a + c * c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }else {
            // c is the longest side
            if (c * c == a * a + b * b) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}