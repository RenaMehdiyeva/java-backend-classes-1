package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class SwitchCaseApp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number from 1 to 12: ");
            int month = scanner.nextInt();

            String season;
            String monthName;

            switch (month) {
                case 1:
                    monthName = "January";
                    season = "Winter";
                    break;
                case 2:
                    monthName = "February";
                    season = "Winter";
                    break;
                case 3:
                    monthName = "March";
                    season = "Spring";
                    break;
                case 4:
                    monthName = "April";
                    season = "Spring";
                    break;
                case 5:
                    monthName = "May";
                    season = "Spring";
                    break;
                case 6:
                    monthName = "June";
                    season = "Summer";
                    break;
                case 7:
                    monthName = "July";
                    season = "Summer";
                    break;
                case 8:
                    monthName = "August";
                    season = "Summer";
                    break;
                case 9:
                    monthName = "September";
                    season = "Autumn";
                    break;
                case 10:
                    monthName = "October";
                    season = "Autumn";
                    break;
                case 11:
                    monthName = "November";
                    season = "Autumn";
                    break;
                case 12:
                    monthName = "December";
                    season = "Winter";
                    break;
                default:
                    monthName = "The correct month was not entered";
                    season = "Unknown";
            }

            if (month >= 1 && month <= 12) {
                System.out.println("Month: " + monthName + ", Season: " + season);
            } else {
                System.out.println("Error: Enter a number from 1 to 12.");
            }

            scanner.close();
        }
    }
