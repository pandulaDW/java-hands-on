package com.company;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    static ArrayDeque<Integer> dq = new ArrayDeque<>();

    public static void asStack() {
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollLast(); // inserting last and deleting last is like a stack
        dq.forEach(n -> System.out.print(n + ", "));
    }

    public static void asQueue() {
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollFirst();
    }
}
