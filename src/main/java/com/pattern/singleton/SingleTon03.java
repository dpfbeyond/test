package com.pattern.singleton;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 双重检查锁
 */
public class SingleTon03 {
    private static volatile SingleTon03 instace;

    private SingleTon03() {
    }

    public static SingleTon03 getInstance() {
        if (instace == null) {
            synchronized (SingleTon03.class) {
                if (instace == null) {
                    instace = new SingleTon03();
                }
            }
        }
        return instace;
    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 3000, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
        executor.execute(() -> {
            System.out.println(SingleTon03.getInstance());
        });
    }
}
