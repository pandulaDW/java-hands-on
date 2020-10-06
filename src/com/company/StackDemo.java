package com.company;


class StackUnderFlow extends Exception {
    @Override
    public String toString() {
        return "StackUnderflow Error: Attempting to remove elements from an empty stack";
    }
}

class StackOverFlow extends Exception {
    @Override
    public String toString() {
        return "StackOverFlow Error: Attempting to insert elements to an already filled stack";
    }
}

public class StackDemo {
    private final int size;
    private int top = -1;
    private final int[] stack;

    public StackDemo(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int el) throws StackOverFlow {
        if (top == size - 1) {
            throw new StackOverFlow();
        }
        top += 1;
        stack[top] = el;
    }

    public void pop() throws StackUnderFlow {
        if (top == -1) {
            throw new StackUnderFlow();
        }
        stack[top] = 0;
        top -= 1;
    }

    public String toString() {
        String heading = String.format("Stack of size %s, filled with %s elements\n", size, top + 1);
        String[] stackElements = new String[top + 1];
        for (int i = 0; i < top + 1; i++) {
            stackElements[i] = String.valueOf(stack[i]);
        }
        return heading + String.join("\n", stackElements);
    }
}








