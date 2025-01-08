package az.edu.turing.module01.SimpleTasks;

import java.util.Scanner;

public class CycleShiftsApp {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String binary = Integer.toBinaryString(n);
            int max = n;
            String current = binary;

            for (int i = 1; i < binary.length(); i++) {
                current = current.substring(1) + current.charAt(0);
                int shiftedValue = Integer.parseInt(current, 2);
                max = Math.max(max, shiftedValue);
            }
            System.out.println(max);
        }
    }
