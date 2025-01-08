package az.edu.turing.module01.SimpleTasks;

import java.util.Scanner;

public class BigAccuracyApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.print("0.");

        while (k-- > 0) {
            n *= 10;
            System.out.print(n / m);
            n %= m;
        }
    }
}