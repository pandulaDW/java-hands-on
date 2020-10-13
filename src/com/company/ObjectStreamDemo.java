package com.company;

import java.io.*;
import java.nio.file.Paths;

// To serialize an object, class has to implement serializable
// static and transient members will not be serializable

class Student2 implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Student2(int rollNo, String name, float avg, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.avg = avg;
        this.dept = dept;
        Data = 500;
        t = 500;
    }

    public String toString() {
        return String.format("\nStudent Details\nRoll %s\nName %s\nAverage %f\n", rollNo, name, avg);
    }
}

public class ObjectStreamDemo {
    static String filepath = Paths.get("data", "student.ser").toAbsolutePath().toString();

    public static void writeMethod() throws IOException {
        FileOutputStream fos = new FileOutputStream(filepath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student2 s = new Student2(10, "John", 89.9f, "CSE");
        oos.writeObject(s);

        fos.close();
        oos.close();
    }

    public static void readMethod() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filepath);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student2 s = (Student2) ois.readObject();
        System.out.println(s);
    }
}











