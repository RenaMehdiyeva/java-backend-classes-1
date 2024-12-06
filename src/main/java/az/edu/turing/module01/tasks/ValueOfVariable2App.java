package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class ValueOfVariable2App {

    public static void main(String[] args) {
        double x = 1.0;
        double y = x-(Math.pow(x,2)+4)/2 + Math.pow(x,2)-(3/(x+7));

        System.out.printf("%.3f\n", y);
    }
}
