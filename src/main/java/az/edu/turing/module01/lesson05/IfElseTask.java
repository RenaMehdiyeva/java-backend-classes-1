package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class IfElseTask {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();

        int value = 0;
        String result = "a";
        if(value%3==0){
            result = "Eded 3-e tam bolunur";
        }else if(value%3==1){
            result = "Eded 3-e tam bolunmur ve qaliq 1-dir";
        }else if(value%3==2) {
            result = "Eded 3-e tam bolunmur ve qaliq 2-dir";
        }
        System.out.println(result);
    }
}
