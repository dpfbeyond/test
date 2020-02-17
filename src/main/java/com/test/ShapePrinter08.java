package com.test;

import java.util.Scanner;

public class ShapePrinter08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character :");
        String str = scanner.nextLine();
        System.out.print("Enter size : ");
        int times = scanner.nextInt();
        printLine(str, times);
        printSquare(str, times);
        printTriangle(str, times);
    }

    public static void printLine(String str, int times) {
        printLoop(str, times);
        System.out.println();
        System.out.println("Number of chars used: " + times);
    }

    public static void printLoop(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(str + ' ');
        }
    }

    public static void printSquare(String str, int times) {
        int sums = times * times;
        for (int i = 0; i < times; i++) {
            printLoop(str, times);
            System.out.println();
        }
        System.out.println("Number of chars used: " + sums);
    }

    public static void printTriangle(String str, int times) {
        int sums = 0;
        for (int i = 0; i < times; i++) {
            printLoop(str, i + 1);
            sums += i;
            if (i == times - 1) {
                sums += times;
            }
            System.out.println();
        }
        System.out.println("Number of chars used:" + sums);
    }
}
