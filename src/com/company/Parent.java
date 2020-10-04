package com.company;

// Parent class constructor is executed before child class constructor
// Only need to call super, if parent has parametrized constructor

class Parent {
    int x = 0;

    public Parent() {
        System.out.println("Parent Constructor");
    }

    public Parent(int x) {
        this.x = x;
        System.out.println("Param of Parent");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }

    public Child(int y) {
        System.out.println("Param of Child");
    }

    public Child(int x, int y) {
        super(x);
        System.out.println("2 Param of Child");
    }

    public void display() {
        System.out.println(super.x);
    }
}