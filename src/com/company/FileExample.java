package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void writeFile() {
        String filepath = new File("data/Test.txt").getAbsolutePath();
        try (FileOutputStream fos = new FileOutputStream(filepath)) {
            String str = "Learn Java Programming";
            byte[] byteArr = str.getBytes();
            fos.write(byteArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
