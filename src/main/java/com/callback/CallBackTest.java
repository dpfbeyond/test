package com.callback;

public class CallBackTest {
    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.test();
    }
}
