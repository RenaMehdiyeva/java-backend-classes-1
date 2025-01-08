package az.edu.turing.module01.IntermediateLevel;

import java.util.Scanner;

public class SearchNumberInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the number to search:");
        int searchNumber = scanner.nextInt();
        boolean found = false;

        for (int num : array) {
            if (num == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchNumber + " is in the array.");
        } else {
            System.out.println(searchNumber + " is not in the array.");
        }
    }
}
