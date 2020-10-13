package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class RandomAccessDemo {
    static Path path = FileSystems.getDefault().getPath("data", "Data.txt");

    public static void read() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(path.toAbsolutePath().toString(), "rw");
        System.out.print((char) rf.read());
        System.out.print((char) rf.read());
        System.out.print((char) rf.read());
        rf.write('d');
        System.out.print((char) rf.read());
        rf.skipBytes(3);
        System.out.print((char) rf.read());
        rf.seek(3);
        System.out.print((char) rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer() + 2);
        System.out.println((char) rf.read());
        System.out.println(rf.length());
    }
}
