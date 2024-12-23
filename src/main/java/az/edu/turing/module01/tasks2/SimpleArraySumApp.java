package az.edu.turing.module01.tasks2;

import java.util.Scanner;

public class SimpleArraySumApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(input[i]);
        }

        int sum = calculateSum(ar);
        System.out.println(sum);
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
