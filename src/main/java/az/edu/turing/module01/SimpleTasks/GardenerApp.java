package az.edu.turing.module01.SimpleTasks;

import java.util.Scanner;

public class GardenerApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 0;
        double sum = 0.0;
        while (sum <= 0.5) {
            sum += 1.0 / (N - i++);
        }
        int K = N - i + 1;
        System.out.println(K);
    }
}