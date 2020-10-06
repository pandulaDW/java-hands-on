package com.company;

public class Main {

    public static void main(String... args) {
        StackDemo stack = new StackDemo(5);
        try {
            stack.push(12);
            stack.push(24);
            stack.push(16);
        } catch (StackOverFlow e) {
            System.out.println(e);
        }
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackUnderFlow e) {
            System.out.println(e);
        }
        System.out.println(stack);
    }
}