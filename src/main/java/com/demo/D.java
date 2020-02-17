package com.demo;

public class D {
    //    private static A a=new A();
//    static {
//        System.out.println("D 静态块");
//    }
    {
        System.out.println("D...");
    }

    public D() {
        System.out.println("D 构造函数");
    }

    public D(int a) {
    }

    @Override
    public String toString() {
        return "";
    }
}
