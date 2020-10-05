package com.company;

import java.io.*;
import java.util.*;

public class TryResources {

    static void divide() throws Exception {
        try (FileInputStream fi = new FileInputStream("/Users/Pandula/Desktop/test.txt");
             Scanner sc = new Scanner(fi)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt(); // c = 0
            System.out.println(a / b);
        }
    }
}
