package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("İşçi sayısı: ");
        int n = in.nextInt();
        double max = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Maaş: ");
            double maas = in.nextDouble();
            if (maas > max) {
                max = maas;
            }
        }
        System.out.printf("En yüksek maaş: %.2f%n", max);
    }
}