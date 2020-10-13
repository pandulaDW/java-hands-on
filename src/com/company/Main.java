package com.company;


public class Main {
    public static void main(String... args) {
        try {
            ObjectStreamDemo.writeMethod();
            ObjectStreamDemo.readMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}