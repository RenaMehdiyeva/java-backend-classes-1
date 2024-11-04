package az.edu.turing.module01.eolymp;

import java.util.Scanner;

public class BucksInTheBankApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long S = 15;
        long totalAmount = 1;
        long amountGivenLastYear = 1;
        int N = 0;

        while (totalAmount < S) {
            N++;
            amountGivenLastYear = (amountGivenLastYear * 2) + N;
            totalAmount += amountGivenLastYear;
        }

        System.out.println(N);
    }
}
