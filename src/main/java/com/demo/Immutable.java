package com.demo;

public final class Immutable {
    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Immutable immutable = new Immutable(5);
        int i = immutable.getValue();
        System.out.println(i);
    }
}
