package az.edu.turing.module01.lesson04;

public class OperationsTask {
    public static void main(String[] args) {

        int a = 15;
        int b = 7;
        a++;
        b++;
        System.out.println("After:" + a + ",b = " + b);

        a--;
        b--;
        System.out.println("Before: " + a + ", b = " + b);

        a += 2;
        System.out.println("Before:" + a);

        b -= 1;
        System.out.println("Before:" + b);

        int x = 8;
        int y = 5;
        int result;

        boolean isEqual = (x == y);
        boolean isNotEqual = (x != y);
        result = (x < y && y > 5) ? x + y : x - y;

        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Result: " + result);

        int l = 10;
        int r = 5;

        l *= 2;
        System.out.println("L after : " + l);

        l /= r;
        System.out.println("L after:" + l);

        l %= 3;
        System.out.println("L after:" + l);

        boolean isLessOrEqual = (l <= r);
        boolean isGreaterOrEqual = (l >= r);

        System.out.println("Is l <= r " + isLessOrEqual);
        System.out.println("Is l >= r " + isGreaterOrEqual);


    }
}
