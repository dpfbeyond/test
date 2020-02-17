package com.pattern.singleton;


public class SingleTon {

    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return singleTon;
    }

    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance1.equals(instance2));

    }
}
