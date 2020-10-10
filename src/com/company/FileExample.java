package com.company;

import java.io.*;

// only difference between file input stream and file reader is that, file reader takes
// in a character or a char array and input streams takes in bytes and byte arrays
// similar thing for the file writer. writer can directly write string without converting into arrays

public class FileExample {

    static String filepath = new File("data/Test.txt").getAbsolutePath();
    static String filepath2 = filepath.replaceAll("Test", "Test2");
    static String filepath3 = filepath.replaceAll("Test", "Test3");

    public static void writeFile() {
        try (FileWriter fos = new FileWriter(filepath)) {
            String str = "Learn Java Programming";
            fos.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try (FileReader fis = new FileReader(filepath)) {
            int x;
            while ((x = fis.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile() {
        String content = "";
        try (FileInputStream fis = new FileInputStream(filepath)) {
            String[] strArray = new String[fis.available()];
            for (int i = 0; i < strArray.length; i++) {
                strArray[i] = String.valueOf((char) fis.read()).toLowerCase();
            }
            content = String.join("", strArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fr = new FileWriter(filepath2)) {
            fr.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileBetter() {
        try {
            FileInputStream fis = new FileInputStream(filepath);
            FileOutputStream fos = new FileOutputStream(filepath2);

            int codepoint;
            while ((codepoint = fis.read()) != -1) {
                if (codepoint >= 65 && codepoint <= 90) fos.write(codepoint + 32);
                else fos.write(codepoint);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sequenceInputRead() {
        try {
            FileInputStream fis1 = new FileInputStream(filepath);
            FileInputStream fis2 = new FileInputStream(filepath2);
            FileOutputStream fos = new FileOutputStream(filepath3);
            SequenceInputStream seqInput = new SequenceInputStream(fis1, fis2);

            int codepoint;
            int counter = 0;
            int file1Length = fis1.available();
            while ((codepoint = seqInput.read()) != -1) {
                if (counter == file1Length) fos.write('\n');
                fos.write(codepoint);
                counter++;
            }

            seqInput.close();
            fis1.close();
            fis2.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



