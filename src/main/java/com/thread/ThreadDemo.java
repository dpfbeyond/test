package com.thread;


public class ThreadDemo extends Thread {

    public synchronized void add() {
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadDemo.currentThread().getName() + " " + i);
        }
    }

    @Override
    public void run() {
        add();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }


}
