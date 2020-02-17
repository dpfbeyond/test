package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenSumCalculator07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower boundary: ");
        int loweer = scanner.nextInt();
        System.out.print("Enter the upper boundary: ");
        int upper = scanner.nextInt();
        sum(loweer, upper);
    }

    public static void sum(int lower, int upper) {
        List<Integer> list = new ArrayList();
        int sums = 0;
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                list.add(i);
                sums += i;
            }
        }
        System.out.println(list);
        System.out.println(sums);
    }

}
