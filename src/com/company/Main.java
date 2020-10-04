package com.company;

public class Main {

    public static void main(String... args) {
        Outer o = new Outer();
        o.outerDisplay();
        o.displayLocalClass();
        o.displayInnerAbstract();
        Outer.StaticInner os = new Outer.StaticInner();
        os.showStatic();
    }
}