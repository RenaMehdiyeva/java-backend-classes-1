package az.edu.turing.module01.tasks2;

import java.util.Scanner;

public class EachOfConditionOfTwoApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        boolean divisibleBy3 = (n % 3 == 0);
        boolean isEven = (n % 2 == 0);
        boolean isTwoDigit = (n >= 10 && n <= 99) || (n >= -99 && n <= -10);

        if (divisibleBy3 && isEven && isTwoDigit) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
