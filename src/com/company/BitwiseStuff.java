package com.company;

public class BitwiseStuff {
    public static void bitwiseOperators() {
        int x = 0b1010; // 10
        int y = 0b0110; // 6
        int z = x ^ y;
        System.out.println(z); // 2

        // left shift
        System.out.printf("%s%n", Integer.toBinaryString(x << 1)); // 20

        // right shift
        System.out.printf("%s%n", Integer.toBinaryString(x >> 1)); // 5

        byte b = 5;
        short s = 200;
        b = (byte) s;
        System.out.println(b);

        int i = 10;
        float f = 12.5f;
        i = (int) f;
        System.out.println(i);
    }
}
