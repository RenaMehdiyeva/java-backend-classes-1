package az.edu.turing.module01.lesson05;

public class LoopApp {

        public static void main(String[] args) {

            System.out.println("Capital letters:");
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println("\n\nLowercase letters:");
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + " ");
            }
        }
    }
