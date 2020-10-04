package com.company;

abstract class MyMy {
    abstract public void show();
}

public class Outer {
    static String greeting = "Hello Static!!";
    int x = 10;
    Inner i = new Inner();

    class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    // Only static content can be accessed here
    static class StaticInner {
        public void showStatic() {
            System.out.println(greeting);
        }
    }

    public void outerDisplay() {
        i.innerDisplay();
    }

    public void displayLocalClass() {
        class LocalInner {
            public void show() {
                System.out.println("Hello");
            }
        }
        LocalInner li = new LocalInner();
        li.show();
    }

    // Anonymous classes (works with interfaces same way)
    public void displayInnerAbstract() {
        MyMy my = new MyMy() {
            @Override
            public void show() {
                System.out.println("something");
            }
        };
        my.show();
    }
}
