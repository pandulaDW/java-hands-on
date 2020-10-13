package com.company;

// byte arrays cannot hold unicode characters

import java.io.*;

public class ByteStreamDemo {
    static byte[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    static char[] c = {'జ', 'ఝ', 'ఞ', 'ట'};
    static ByteArrayInputStream bis = new ByteArrayInputStream(b);
    static ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
    static CharArrayReader cr = new CharArrayReader(c);
    static String filepath = new File("data/Test4.txt").getAbsolutePath();

    public static void readByteStream() throws IOException {
        int x;
        while ((x = bis.read()) != -1) {
            System.out.print((char) x);
        }
        bis.close();
    }

    public static void readAllBytes() throws IOException {
        String str = new String(bis.readAllBytes());
        System.out.println(bis.markSupported());
        bis.close();
    }

    public static void writeByteStream() throws IOException {
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        System.out.println(new String(bos.toByteArray()));
        try {
            bos.writeTo(new FileOutputStream(filepath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        bos.close();
    }

    public static void readCharArrayStream() throws IOException {
        int x;
        while ((x = cr.read()) != -1) {
            System.out.print((char) x);
        }
        cr.close();
    }
}





