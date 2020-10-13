package com.company;

// using object as a type reference have few drawbacks. It's not type safe since
// any class can be assigned. To get the actual type reference, you have to type cast it.
// compiler doesn't check it at compile time and it could lead to run time errors

import java.util.Arrays;

class A {
};

class B extends A {
}

class C extends B {
}

public class GenericDemo {

    public static void genericsUsingObject() {
        Object[] obj = new Object[3];
        obj[0] = "Hi";
        obj[1] = "Bye";
        obj[2] = 2;
//        String s = (String) obj[2]; run time error
        System.out.println(Arrays.toString(obj));
    }

    @SuppressWarnings("unchecked")
    public static void genericsUsingGenericClass() {
        Data<Integer> data1 = new Data<>();
        data1.setData(10); // autoboxing
        System.out.println(data1.getData());

        Data<String> data2 = new Data<>();
        data2.setData("Hello");
        System.out.println(data2.getData());

        MyGenericArray<Integer> t1 = new MyGenericArray<>(3);
        t1.append(2);
        t1.append(5);
        t1.display();

        MyGenericArray<String> s1 = new MyGenericArray<>(4);
        s1.append("Hi");
        s1.display();

        // If not parameter is given, it will take it as Object
        Data data3 = new Data<>();
        data3.setData(5);
        System.out.println(data3.getData());

        Data2 data4 = new Data2();
        data4.setData("Hello!!");
        System.out.println(data4.getData());

        Data4<Integer> data5 = new Data4<>();
        data5.setNum(10);
        System.out.println(data5.num);
    }

    // Generic methods (no need of a generic class to write a generic method)
    // below method can take any array type of object
    public static <E> void show(E[] list) {
        for (E x : list) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    // Generic arguments --> can give bounds
    // extends --> upper bound
    // super --> lower bound
    // Below will accept type B, C
    public static void fun1(MyGenericArray<? extends B> obj) {
        obj.display();
    }

    // Below will accept type A, B
    public static void fun2(MyGenericArray<? super B> obj) {
        obj.display();
    }
}

// classes should be made as generic
// generic only supports objects and not primitives
// generic classes can take multiple parameters
class Data<T> {
    T obj;

    public T getData() {
        return obj;
    }

    public void setData(T data) {
        obj = data;
    }
}

// subclass has to specify a type, otherwise taken as object
class Data2 extends Data<String> {
}

// to have a generic subtype,
class Data3<K> extends Data<K> {
}

// Bounded type (only types extending Number can be created)
// Extend works for both classes and interfaces
class Data4<T extends Number> {
    T num;

    public void setNum(T num) {
        this.num = num;
    }
}

class MyGenericArray<T> {
    private final int capacity;
    private int length;
    private final T[] dataArray;

    @SuppressWarnings("unchecked")
    MyGenericArray(int capacity) {
        this.capacity = capacity;
        this.dataArray = (T[]) new Object[capacity];
    }

    public void append(T data) {
        if (length > capacity) {
            throw new ArrayIndexOutOfBoundsException();
        }
        dataArray[length] = data;
        length++;
    }

    public void display() {
        for (T item : dataArray) {
            if (item != null) System.out.print(item + ", ");
        }
        System.out.println();
    }
};



