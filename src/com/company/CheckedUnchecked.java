package com.company;

// unchecked exceptions are compiled without errors
// checked exceptions should be handled, o/w compiler won't compile
// custom exceptions should extend from base Exception class
// custom exceptions are all checked exceptions
// if you specify that you are throwing an exception in a method, then the calling method
// must handle it

class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class CheckedUnchecked {
    static void fun1() {
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }
}
