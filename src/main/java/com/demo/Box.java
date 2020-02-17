package com.demo;

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <E> void met(E e) {
    }

    public static void main(String[] args) {

    }
}
