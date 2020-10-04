package com.company;

// Instant variables in interfaces are static and final by default
// by default methods in interfaces are abstract
// however, interfaces can have concrete static/default methods
// interfaces can be extended by other interfaces
// default method can be used to modify interfaces without harming implemented classes
// private methods can defined inside an interface as helper methods for default methods

interface Member {
    int X = 10;

    void callback();

    public default void meth() {
        System.out.println("Meth of Member");
    }
}

interface Test extends Member {
    void meth2();
}

// Have to override all the interface and it's super interface methods
class My implements Test {
    @Override
    public void callback() {
    }

    @Override
    public void meth2() {
    }
}

class Customer implements Member {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.printf("Ok, %s will visit\n", this.name);
    }
}

class Employee implements Member {
    int employeeID;
    String name;

    public Employee(int employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.printf("OK, %s with %d ID will work\n", name, employeeID);
    }
}

class Store {
    Member[] mem = new Member[100];
    int count = 0;

    void register(Member member) {
        mem[count++] = member;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}