package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class Corona2020App {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            boolean found = false;

            if (a + b + c == 2020) {
                System.out.println(a + "+" + b + "+" + c);
                found = true;
            } else if (a - b + c == 2020) {
                System.out.println(a + "-" + b + "+" + c);
                found = true;
            } else if (a + b - c == 2020) {
                System.out.println(a + "+" + b + "-" + c);
                found = true;
            } else if (a - b - c == 2020) {
                System.out.println(a + "-" + b + "-" + c);
                found = true;
            } else if (-a + b + c == 2020) {
                System.out.println("-" + a + "+" + b + "+" + c);
                found = true;
            } else if (-a + b - c == 2020) {
                System.out.println("-" + a + "+" + b + "-" + c);
                found = true;
            } else if (-a - b + c == 2020) {
                System.out.println("-" + a + "-" + b + "+" + c);
                found = true;
            } else if (-a - b - c == 2020) {
                System.out.println("-" + a + "-" + b + "-" + c);
                found = true;
            }

            if (!found) {
                System.out.println("CORONA");
            }
        }
}

