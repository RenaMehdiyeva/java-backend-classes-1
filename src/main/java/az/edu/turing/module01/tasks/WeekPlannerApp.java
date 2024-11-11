package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class WeekPlannerApp {

    public static void main(String[] args) {

        String schedule[][] = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to the gym";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "grocery shopping";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "read a book";
        schedule[5][0] = "Friday";
        schedule[5][1] = "work on project";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "relax and enjoy the day";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please, input the day of the week: ");
            String inputDay = scanner.nextLine().trim();

            boolean validDay = false;

            for (int i = 0; i < schedule.length; i++) {
                if (schedule[i][0].equalsIgnoreCase(inputDay)) {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1] + ".");
                    validDay = true;
                    break;
                }
            }
            if (!validDay) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
