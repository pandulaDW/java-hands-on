package com.company;

// All enum fields are public static and final
// For each enum field creation, the constructor is called
// Can assign values to enum, need to have a parametrized constructor

import java.util.Arrays;

public class EnumDemo {
    enum Dept {
        CS, IT, CIVIL, ECE;

        private Dept() {
            System.out.println(this.name());
        }

        public void display() {
            System.out.println(this.name() + " : " + this.ordinal());
        }
    }

    enum Dept2 {
        CS("John", "Block A"), IT("Smith", "Block B"),
        CIVIL("Srinivas", "Block C"), ECE("Dave", "Block D");

        String head;
        String location;

        private Dept2(String head, String loc) {
            this.head = head;
            this.location = loc;
        }
    }

    public static void enumMethod() {
        Dept d = Dept.CIVIL;
        Dept2 d2 = Dept2.CS;
        d.display();
        System.out.println(Arrays.toString(Dept.values()));
        System.out.println(d.getClass()); // object of enum dept class
        System.out.println(d.ordinal()); // 2
        System.out.println(d.name().getClass()); // CIVIL (String)
        System.out.println(Dept.valueOf("IT")); // IT

        System.out.printf("Head: %s \n%s", d2.head, d2.location);
    }
}
