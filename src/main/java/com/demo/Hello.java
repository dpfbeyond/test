package com.demo;

public class Hello<T> {
    private T t;

    public <T> T getName() {
        return null;
    }

    public Hello<T> add() {
        return new Hello<>();
    }

    public static void main(String[] args) {
        new Hello().getName();
    }
}
