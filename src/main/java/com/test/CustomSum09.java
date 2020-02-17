package com.test;

import java.util.Scanner;

public class CustomSum09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Number 1: ");
        int a = scanner.nextInt();
        System.out.print("Please enter Number 2: ");
        int b = scanner.nextInt();
        System.out.print("Please enter Number 3: ");
        int c = scanner.nextInt();
        System.out.print("Please enter boolean 1: ");
        boolean b1 = scanner.nextBoolean();
        System.out.print("Please enter boolean 2: ");
        boolean b2 = scanner.nextBoolean();
        add(a, b);
        add(a, b, c);
        add((double) a, b);
        add((double) a, b, c);
        add(b1, b2);
    }

    public static int add(int a, int b) {
        System.out.println("int add(int …, int … ) - - -> add(" + a + "," + b + "); - - - > returns " + (a + b));
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("int add(int …, int … ,int ...) - - -> add(" + a + "," + b + "," + c + "); - - - > returns " + (a + b + c));
        return a + b + c;
    }

    public static double add(double a, double b) {
        System.out.println("double add(double …, double … ) - - -> add(" + a + "," + b + "); - - - > returns " + (a + b));
        return a + b;
    }

    public static double add(double a, double b, double c) {
        System.out.println("double add(double …, double … ,double ...) - - -> add(" + a + "," + b + "," + c + "); - - - > returns " + (a + b + c));
        return a + b + c;
    }

    public static boolean add(boolean b1, boolean b2) {
        System.out.println("boolean add(boolean …, boolean … ) - - -> add(" + b1 + "," + b2 + "); - - - > returns " + (true));
        return true;
    }

}
