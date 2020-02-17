package com.shape;

public class Point implements Shape {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int xval, int yval) {
        x = xval;
        y = yval;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public double getArea() {
        return x * y;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "[" +
                +x +
                ", " + y +
                ']';
    }
}
