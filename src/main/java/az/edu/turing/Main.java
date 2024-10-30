package az.edu.turing;

public class Main {
    public static void main(String[] args) {
        byte byteValue = 20;
        short shortValue = 10000;
        int intValue = 400000;
        long longValue = 70000000000L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159;
        char charValue = 'R';
        boolean booleanValue = true;


        System.out.println("Using println:");
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.printf("byte: %d\n", byteValue);
        ;
        System.out.printf("float: %.2f\n", floatValue);
        System.out.printf("double: %.5f\n", doubleValue);
        System.out.printf("char: %c\n", charValue);
        System.out.printf("boolean: %b\n", booleanValue);
    }
}
