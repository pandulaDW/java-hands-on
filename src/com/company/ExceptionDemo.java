package com.company;

import java.util.Scanner;

public class ExceptionDemo {
    public void display() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Bye");
        sc.close();
    }

    public void nestedExceptions() {
        int[] A = {30, 20, 10, 50, 0};
        try {
            int c = A[0] / A[4];
            System.out.println(c);
            System.out.println(A[10]); // this won't run 
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }
        System.out.println("Bye");
    }
}
