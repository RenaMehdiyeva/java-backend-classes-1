package az.edu.turing.module01.SimpleTasks;

import java.util.*;

public class TheFavouriteNumbersOfSantaClausApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int MAX = 500000;
            boolean[] isPrime = new boolean[MAX + 1];

            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

            for (int i = 2; i * i <= MAX; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= MAX; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
            int count = 0;

            for (int i = a; i <= b; i++) {
                if (isPrime[i] && !Integer.toString(i).contains("13")) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
