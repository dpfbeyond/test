package com.shape;

public class Cylinder extends Circle {
    private double h;

    public Cylinder() {
        super();
        h = 0;
    }

    public Cylinder(int x, int y, double r, double h) {
        super(x, y, r);
    }

    public void setHeight(double hval) {
        this.h = hval;
    }

    public double getHeight() {
        return h;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + 2 * Math.PI * getRadius() * h;
    }

    @Override
    public String toString() {
        return super.toString() + ";H" + h;
    }

    @Override
    public double getVolume() {
        return super.getVolume() * h;
    }
}
