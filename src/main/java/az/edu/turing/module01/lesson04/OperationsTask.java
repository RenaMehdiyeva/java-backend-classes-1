package az.edu.turing.module01.lesson04;

public class OperationsTask {
    public static void main(String[] args) {

        int a = 15;
        int b = 7;
        a++;
        b++;
        System.out.println("After ++: a = " + a + ", b = " + b);
        a--;
        b--;
        System.out.println("Before --: a = " + a + ", b = " + b);
        a += 2;
        System.out.println("Before +=: a = " + a);

        b -= 1;
        System.out.println("Before -=: b = " + b);


    }
}
