package az.edu.turing.module01.polymorphism;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
