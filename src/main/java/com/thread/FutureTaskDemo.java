package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo implements Callable<Integer> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> c = new FutureTaskDemo();
        FutureTask<Integer> ft = new FutureTask<>(c);
        Thread t1 = new Thread(ft);
        t1.start();
        Integer i1 = ft.get();
    }


    @Override
    public Integer call() throws Exception {
        System.out.println("线程创建成功");
        return 2;
    }
}
