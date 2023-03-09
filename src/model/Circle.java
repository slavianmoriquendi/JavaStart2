package model;

public class Circle implements Shape {
    private double r;

    @Override
    public double calculateArea() {
        return Shape.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape.PI * r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
