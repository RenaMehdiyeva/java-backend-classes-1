package az.edu.turing.module01.lesson05;

public class WhileLoopApp {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            if(i == 5) {
                break;
            }
            else if(i == 3) {
                i++;
                continue;
            }
            i++;
        }
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
    }
}