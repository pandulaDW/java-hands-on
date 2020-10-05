package com.company;

class NoNegativeValuesException extends Exception {
    public String toString() {
        return "Dimensions should not be negative";
    }
}

public class ThrowThrowsDemo {
    static int area(int l, int b) throws NoNegativeValuesException {
        if (l < 0 || b < 0) {
            throw new NoNegativeValuesException();
        }
        return l * b;
    }

    static void meth1() {
        try {
            System.out.println(area(10, 25));
        } catch (NoNegativeValuesException e) {
            System.out.println(e);
        }
    }
}
