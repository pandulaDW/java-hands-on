package com.company;

public class Main {

    public static void main(String... args) throws Exception {
        try {
            TryResources.divide();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}