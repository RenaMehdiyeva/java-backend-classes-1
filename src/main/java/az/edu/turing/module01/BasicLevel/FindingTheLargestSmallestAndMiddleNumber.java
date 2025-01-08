package az.edu.turing.module01.BasicLevel;

import java.util.Scanner;

public class FindingTheLargestSmallestAndMiddleNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        if (count < 3) {
            System.out.println("Please enter at least 3 numbers.");
            return;
        }

        int[] numbers = new int[count];

        System.out.println("Enter the integers:");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        int smallest = numbers[0];
        int largest = numbers[count - 1];
        int middle = numbers[count / 2]; // Find the middle after sorting

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Middle: " + middle);
    }
}

