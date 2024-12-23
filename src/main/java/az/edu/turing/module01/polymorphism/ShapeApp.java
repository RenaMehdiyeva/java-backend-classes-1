package az.edu.turing.module01.polymorphism;

public class ShapeApp {

    public static void main(String[] args) {
        Shape circle1 = new Circle("Red", 6.0);
        Shape circle2 = new Circle("Red", 6.0);
        Shape rectangle = new Rectangle("Blue", 3.0, 5.0);

        System.out.println(circle1);
        System.out.println("Area of a circle: " + circle1.calculateArea());

        System.out.println(rectangle);
        System.out.println("Area of a rectangle: " + rectangle.calculateArea());


        System.out.println("circle1 and circle2 is it the same? " + circle1.equals(circle2));
        System.out.println("circle1 hashCode: " + circle1.hashCode());
        System.out.println("circle2 hashCode: " + circle2.hashCode());
    }
}

