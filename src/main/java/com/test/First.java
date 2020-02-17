package com.test;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input sides:");
        String sides = scanner.nextLine();
        while (true) {
            if (!sides.matches("^[0-9]*$") || Integer.parseInt(sides) < 2) {
                System.out.println("Illeagal parameter");
                System.out.println("Please input sides:");
                sides = scanner.nextLine();
            } else {
                break;
            }
        }

        System.out.println("Please input times:");
        String times = scanner.nextLine();
        while (true) {
            if (!times.matches("^[0-9]*$") || Integer.parseInt(sides) < 2) {
                System.out.println("Please input times:");
                times = scanner.nextLine();
            } else {
                break;
            }
        }

    }


}
