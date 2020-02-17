package com.shape;

import java.util.Scanner;

public class ShapeTest implements Shape {
    private Shape shape;

    public ShapeTest(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String getName() {
        return shape.getName();
    }

    @Override
    public double getArea() {
        return shape.getArea();
    }

    @Override
    public double getVolume() {
        return shape.getVolume();
    }

    @Override
    public String toString() {
        return shape.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select the shape");
        System.out.println("1.Point");
        System.out.println("2.Circle");
        System.out.println("3.Cylinder");
        System.out.print("Please enter the selection: ");
        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                testPoint();
                break;
            case 2:
                testCircle();
                break;
            case 3:
                testCylinder();
                break;
        }

    }

    public static void testPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The shape of the point is selected");
        System.out.print("Enter x:");
        int x = scanner.nextInt();
        System.out.print("Enter y:");
        int y = scanner.nextInt();
        Shape shape = new Point(x, y);
        System.out.println("The shape is " + shape.getName() + " The area " + shape.getArea() + " the volume " + shape.getVolume());
    }

    public static void testCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x:");
        int x = scanner.nextInt();
        System.out.print("Enter y:");
        int y = scanner.nextInt();
        System.out.print("Enter r:");
        int r = scanner.nextInt();
        Shape shape = new Circle(x, y, r);
        System.out.println("The shape is " + shape.getName() + " The area " + shape.getArea() + " the volume: " + shape.getVolume());

    }

    public static void testCylinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x:");
        int x = scanner.nextInt();
        System.out.print("Enter y:");
        int y = scanner.nextInt();
        System.out.print("Enter r:");
        int r = scanner.nextInt();
        System.out.print("Enter h:");
        int h = scanner.nextInt();
        Shape shape = new Cylinder(x, y, r, h);
        System.out.println("The shape is " + shape.getName() + " The area " + shape.getArea() + " the volume" + shape.getVolume());
    }
}
