package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String result = "";


        switch (value % 3) {
            case 0:
                result = "Eded 3-e tam bolunur";
                break;
            case 1:
                result = "Eded 3-e tam bolunmur ve qaliq 1-dir";
                break;
            case 2:
                result = "Eded 3-e tam bolunmur ve qaliq 2-dir";
                break;
            default:
                result = "Eded 3-e tam bolunmur ve qaliq " + value % 3 + "-dir";
        }

        System.out.println(result);
    }
}
