package com.thread;

public class ThreadLocalDemo {
    static Integer a = 100;
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set(a);
        new Thread(() -> {
            threadLocal.set(2);
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
        }).start();
        new Thread(() -> {
            threadLocal.set(5);
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
        }).start();
        new Thread(() -> {
            threadLocal.set(15);
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
        }).start();
        System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
    }
}
