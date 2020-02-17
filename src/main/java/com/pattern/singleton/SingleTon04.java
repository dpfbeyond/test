package com.pattern.singleton;

/*
 * 静态内部类单例
 * */
public class SingleTon04 {
    private SingleTon04() {
    }

    public static SingleTon04 getInstance() {
        return Inner.instance;
    }

    private static class Inner {
        private static final SingleTon04 instance = new SingleTon04();
    }

    public static void main(String[] args) {
        SingleTon04 sin = SingleTon04.getInstance();
        SingleTon04 sin1 = SingleTon04.getInstance();
        SingleTon04 sin2 = SingleTon04.getInstance();
        SingleTon04 sin3 = SingleTon04.getInstance();
        System.out.println(sin);
        System.out.println(sin1);
        System.out.println(sin3);
        System.out.println(sin2);
    }
}
