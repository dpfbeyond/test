package com.callback;

public class B {
    public void test(Callback callback) {
        System.out.println("B 开始调用回调");
        callback.execute();
    }
}
