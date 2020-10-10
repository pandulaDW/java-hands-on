package com.company;

public class IntegerClass {
    static int m1 = 15;
    static Integer m2 = m1;
    static Integer m3 = 15;
    static Integer m4 = Integer.valueOf("5");
    static Integer m5 = Integer.valueOf("1010", 2);
    static Integer m6 = Integer.decode("0xA7");

    static float a = 12.5f;
    static Float b = a;
    static Character c = 'A';

    public static void intMethods() {
        System.out.println(m2.compareTo(15)); // 1, -1 and 0
        System.out.println(m2.equals(m1)); // value check not reference
        System.out.println(m2.equals(m3)); // value check not reference
        System.out.println(m5);
    }

    public static void floatMethods() {
        System.out.println(b.equals(a));
        System.out.println(Float.valueOf((float) Math.sqrt(-1)).isNaN());
        System.out.println(Character.codePointAt(new char[]{'A', 'B', 'C'}, 2));
        System.out.println(Character.isDigit('2'));
    }
}













