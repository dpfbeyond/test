package com.thread;


public class AtomicDemo {
    private static int n = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                n++;
            }
            System.out.println(n);
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                n++;
            }
            System.out.println(n);
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                n++;
            }
            System.out.println(n);
        }).start();

    }


}
