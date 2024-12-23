package az.edu.turing.module01.polymorphism;

import java.util.Objects;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public double calculateArea() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
