package com.demo;

public class Single {
    private Single() {
    }

    public static Single getInstance() {
        return new Single();
    }
}
