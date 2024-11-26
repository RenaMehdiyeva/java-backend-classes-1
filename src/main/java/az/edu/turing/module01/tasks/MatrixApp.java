package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class MatrixApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}


