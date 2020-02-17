package com.shape;

public class Circle extends Point {
    private double r;

    public Circle() {
        super();
        r = 0;
    }

    public double getRadius() {
        return Math.PI * r * r;
    }

    public void setRadius(double rval) {
        r = rval < 0 ? 0 : rval;
    }

    public Circle(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "C=" + super.toString() + ";R=" + r;
    }
}
