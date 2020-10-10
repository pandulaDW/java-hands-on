package com.company;

// Byte cannot use value of directly since there are only int literals

public class WrapperDemo {
    Integer a1 = Integer.valueOf(10); // this is called as boxing or wrapping 
    Integer a2 = Integer.valueOf("10");
    Byte c = 15; // Auto-boxing
    byte bb = 15;
    Byte e = Byte.valueOf(bb);
    Float h = Float.valueOf((float) 12.23);
    Character k = Character.valueOf('A');
    Boolean l = Boolean.valueOf("true");
    float x1 = h.floatValue();
    float x2 = h; // can be directly assigned like this (Auto-unboxing)
}
