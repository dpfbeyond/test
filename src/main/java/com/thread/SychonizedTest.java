package com.thread;

public class SychonizedTest {
    private static volatile int a = 1;

    public static void main(String[] args) {
        new Thread(() -> {
            a = a * 6;
        }).start();
        new Thread(() -> {
            System.out.println(a);
        }).start();
    }
}
