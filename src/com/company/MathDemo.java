package com.company;

public class MathDemo {
    public static void mathMethods() {
        System.out.println("Absolute: " + Math.abs(-100));
        System.out.println("Cube result: " + Math.cbrt(9));
        System.out.println("Exact decrement: " + Math.decrementExact(2)); // throw exception on underflow
        System.out.println("Random: " + Math.random()); // 0, 1
        System.out.println("Int Random: " + (int) Math.floor(Math.random() * 100));
    }
}
