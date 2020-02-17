package com.demo;


public class Demo {

    public static void main(String[] args) {
        int a = 1;
        System.out.println("传入前:" + a);
        change(a);
        System.out.println("传入后:" + a);
        Person p = new Person();
        p.x = 1;
        System.out.println("传入前:" + p.x);
        change(p);
        System.out.println("传入之后:" + p.x);

    }

    public static void change(Person p) {
        p.x = 2;
    }

    public static void change(int a) {
        a += 3;
    }
}

class Person {
    int x;
}