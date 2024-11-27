package az.edu.turing.module01.tasks;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int say=0;
        int[] a= new int[n];

        for(int i=0; n>i; i++){
            a[i]= in.nextInt();
        }
        for(int j=1;n-1>j;j++){
            if (a[j-1]<a[j]&& a[j]>a[j+1]) {
                say++;
            }
        }
        System.out.println(say);
    }
}



