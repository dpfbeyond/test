package com.demo;

import java.lang.reflect.Constructor;

public class C implements Cloneable {
//    private static D d=new D();
//    static {
//        System.out.println("C....");
//    }

    public C() {
        System.out.println("C 构造函数");
    }

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
        Class<?> d = Class.forName("com.demo.D");
        Constructor<?>[] constructors = d.getConstructors();
    }
}
