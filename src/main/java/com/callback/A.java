package com.callback;

public class A implements Callback {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public void test() {
        System.out.println("开始调用B test方法");
        b.test(this);
    }

    @Override
    public void execute() {
        System.out.println("A:回调接口");
    }
}
