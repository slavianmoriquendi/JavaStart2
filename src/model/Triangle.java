package model;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    @Override
    public double calculateArea() {
        return (Math.sqrt((0.5*(a+b+c))*(0.5*(a+b+c)-a)*((a+b+c)-b)*(0.5*(a+b+c)-c))); //Ten zjebany wzór HERONA

    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
