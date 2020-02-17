package com.pattern.singleton;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Singleton02 {
    private static Singleton02 instace;

    private Singleton02() {

    }

    public static Singleton02 getInstace() {
        if (instace == null) {
            instace = new Singleton02();
        }
        return instace;
    }

    public static void main(String[] args) {
        Singleton02 sin1 = Singleton02.getInstace();
        Singleton02 sin2 = Singleton02.getInstace();
        Singleton02 sin3 = Singleton02.getInstace();
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(3, 5,
                        3000,
                        TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        threadPoolExecutor.execute(() -> {
            System.out.println(Singleton02.getInstace());

        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Singleton02.getInstace());

        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Singleton02.getInstace());

        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Singleton02.getInstace());

        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Singleton02.getInstace());

        });


    }
}
