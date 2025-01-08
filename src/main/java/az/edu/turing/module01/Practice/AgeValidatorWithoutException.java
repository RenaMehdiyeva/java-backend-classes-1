package az.edu.turing.module01.Practice;

//Handle age verification in the usual way

import java.util.Scanner;

public class AgeValidatorWithoutException {

    public static boolean isAgeValid(int age) {
        if (age < 0) {
            System.out.println("Error: Age cannot be negative!");
            return false;
        }
        if (age > 150) {
            System.out.println("Error: This age is not real! (greater than 150)");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        try {
            int age = scanner.nextInt();
            if (isAgeValid(age)) {
                System.out.println("Age Accepted: " + age);
            }
        } catch (Exception e) {
            System.out.println("Error: You can only enter a number!");
        }
    }
}
