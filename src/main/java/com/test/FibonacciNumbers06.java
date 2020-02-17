package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbers06 {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which index from the Fibonacci sequence do you want? : ");
        int num = scanner.nextInt();
        createNums(num);
        getNum(num);
    }

    public static void createNums(int nums) {
        list.add(0);
        for (int i = 1; i < nums; i++) {
            list.add(fib(i));
        }
        System.out.println(list);
    }

    public static void getNum(int num) {
        System.out.println(list.get(num - 1));
    }

    public static int fib(int num) {
        //判断：是否是第一个数和第二个数
        if (num == 1 || num == 2) {
            return 1;
        } else {
            //循环调用本函数
            return fib(num - 2) + fib(num - 1);
        }
    }
}
