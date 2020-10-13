package com.company;

import java.io.*;
import java.nio.file.Paths;

class Student {
    int rollNo;
    String name;
    float avg;
    String dept;
}

public class PrintSteamDemo {

    static String filepath = Paths.get("data", "student.txt").toAbsolutePath().toString();
    static String filepath2 = Paths.get("data", "student2.txt").toAbsolutePath().toString();

    public static void writePrintStream() throws IOException {
        FileOutputStream fos = new FileOutputStream(filepath);
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollNo = 12;
        s.name = "John";
        s.dept = "CSE";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
    }

    public static void readStream() throws IOException {
        FileInputStream fis = new FileInputStream(filepath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student s = new Student();
        s.rollNo = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.printf("Student: %d, %s, %s", s.rollNo, s.name, s.dept);
        fis.close();
        br.close();
    }

    public static void dataStreamWrite() throws IOException{
        FileOutputStream fos = new FileOutputStream(filepath2);
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.name = "John";
        s.avg = 80.5f;
        s.dept = "CSE";

        dos.writeInt(s.rollNo);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();
    }

    public static void dataStreamRead() throws IOException {
        FileInputStream fis = new FileInputStream(filepath2);
        DataInputStream dis = new DataInputStream(fis);

        Student s=  new Student();
        s.rollNo = dis.readInt();
        s.name = dis.readUTF();
        s.avg = dis.readFloat();
        s.dept = dis.readUTF();

        System.out.printf("Student: %d, %s, %s", s.rollNo, s.name, s.dept);
    }
}









