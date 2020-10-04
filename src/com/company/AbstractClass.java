package com.company;

// abstract classes cannot be instantiated
// can include concrete and abstract methods
// can be used as reference types (dynamic method dispatch)
// if abstract method is present in a class, it should be abstract
// subclasses have to implement the abstract methods

abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void method1() {
        System.out.println("Meth1 of Super");
    }

    public abstract void method2();
}

class Sub extends Super {
    @Override
    public void method2() {
        System.out.println("Overriding abstract methods");
    }
}



