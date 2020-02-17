package com.thread;


import java.util.concurrent.*;

public class ThreadPoolTest {


    public static void main(String[] args) {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(3, 3, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + " sdfsdf"));
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行任务1");
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行任务2");
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行任务3");
        });
        threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + " 执行任务4"));
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行任务5");
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行任务6");
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行任务7");
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行任务8");
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行任务9");
        });
    }
}
