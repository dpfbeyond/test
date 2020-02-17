package com.demo;

import java.util.Arrays;

public class B extends A {


    public B() {
        System.out.println("B 构造函数");
    }

    public B(int i) {
        System.out.println("B :" + i);
    }

    public static void main(String[] args) {
        new B(1);
    }
}
