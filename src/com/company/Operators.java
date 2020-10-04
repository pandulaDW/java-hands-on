package com.company;

public class Operators {
    public static void operators() {
        byte a = 10;
        short b = 15;
//      byte c = a+b; result is an integer

        float c = 12.5f;
        long l = 1231;
//      long d = c * b; result is float

        float h = 12.5f;
        double g = 123;
//      float x = h * g; result is double

        char ch = 40;
        int k = 30;
//      char i = a -b;  result is integer

        int x = 6, y;
        y = x++; // x value is assigned to y and then x will be incremented
        y = ++x; // x value is incremented and then assigned to y
        System.out.println(x + " " + y);


    }
}
