package az.edu.turing.module01.ExceptionTask;

import java.util.Scanner;

public class AgeStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[50];
        int count = 0;

        System.out.println("Enter ages (type 'stop' or 'exit' to finish):");

        while (true) {
            try {
                if (count >= 50) {
                    System.out.println("Maximum number of ages (50) reached.");
                    break;
                }

                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("exit")) {
                    break;
                }

                int age = Integer.parseInt(input);

                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                } else if (age > 200) {
                    throw new ArithmeticException("Age is too large.");
                }

                ages[count++] = age;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        printEnteredAges(ages, count);
        printSummary(ages, count);
    }

    private static void printEnteredAges(int[] ages, int count) {
        System.out.print("Entered Ages: [");
        for (int i = 0; i < count; i++) {
            System.out.print(ages[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printSummary(int[] ages, int count) {
        StringBuilder details = new StringBuilder();
        int sum = 0;
        int children = 0, teenagers = 0, adults = 0, seniors = 0;

        details.append("\nDetails for each age:\n");

        for (int i = 0; i < count; i++) {
            int age = ages[i];
            details.append("- Age: ").append(age);

            try {
                long factorial = calculateFactorial(age);
                details.append(" -> Factorial: ").append(factorial);
            } catch (ArithmeticException e) {
                details.append(" -> Factorial too large to calculate");
            }

            details.append(", ").append(isEven(age) ? "Even." : "Odd.").append("\n");

            sum += age;
            if (age <= 12) {
                children++;
            } else if (age <= 19) {
                teenagers++;
            } else if (age <= 64) {
                adults++;
            } else {
                seniors++;
            }
        }

        details.append("\nStatistical Summary:\n");
        details.append("- Total number of people: ").append(count).append("\n");
        details.append("- Sum of ages: ").append(sum).append("\n");
        details.append("- Average age: ").append(count > 0 ? (double) sum / count : 0).append("\n");
        details.append("- Age Group Statistics:\n");
        details.append("  * Children: ").append(children).append(" person(s)\n");
        details.append("  * Teenagers: ").append(teenagers).append(" person(s)\n");
        details.append("  * Adults: ").append(adults).append(" person(s)\n");
        details.append("  * Seniors: ").append(seniors).append(" person(s)\n");

        System.out.println(details);
    }

    private static long calculateFactorial(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Factorial of negative numbers is undefined.");
        }

        long factorial = 1;
        for (int i = 1; i <= age; i++) {
            factorial *= i;
            if (factorial < 0) {
                throw new ArithmeticException("Factorial result is too large.");
            }
        }
        return factorial;
    }

    private static boolean isEven(int age) {
        return age % 2 == 0;
    }
}
