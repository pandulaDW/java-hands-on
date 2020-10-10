package com.company;

// if an interface is having only a single method, it's called functional interface
// lambda refers to the single method in the functional interface type
// variables outside the scope of lambda can be referred, but cannot be modified
// lambdas can be used as first class citizens
// interfaces can be assigned to a method reference

@FunctionalInterface
interface MyLambda {
    void display(String str);
}

public class LambdaDemo {

    public LambdaDemo(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}
