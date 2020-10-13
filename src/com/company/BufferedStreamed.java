package com.company;

// file input stream is attached to a source
// Buffered input stream is attached to another input stream
// on buffer mark is supported
// buffered reader is similar to buffered input stream
// buffered reader is used for character, good for unicode

import java.io.*;

public class BufferedStreamed {
    static String filepath = new File("data/Test.txt").getAbsolutePath();

    public static void readBufferedStream() throws IOException {
        FileInputStream fis = new FileInputStream(filepath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println("File " + fis.markSupported());
        System.out.println("Buffer " + bis.markSupported());

        System.out.print((char) bis.read()); // l
        System.out.print((char) bis.read()); // e
        System.out.print((char) bis.read()); // a
        bis.mark(10); // mark will be set on r
        System.out.print((char) bis.read()); // r
        System.out.print((char) bis.read()); // n
        bis.reset();

        System.out.print((char) bis.read()); // r
        System.out.print((char) bis.read()); // n
    }

    public static void bufferedReader() throws IOException {
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);

        StringBuilder content = new StringBuilder();
        String line;
        do {
            line = br.readLine();
            if (line != null) content.append(line).append("\n");
        } while (line != null);
        System.out.println(content);
    }
}
