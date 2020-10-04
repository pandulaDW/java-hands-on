package com.company;

public class Outer {
    int x = 10;
    Inner i = new Inner();

    class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay() {
        i.innerDisplay();
    }
}
