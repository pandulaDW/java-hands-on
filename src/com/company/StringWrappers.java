package com.company;

// String objects are immutable
// String Buffer and String Builder works like slices in Go
// They are mutable and has a length and capacity property
// String buffer is thread safe and String builder is not thread safe
// String builder is faster (use if only one thread is using it)
// Append method increases the capacity of the underlying character array, like Go

public class StringWrappers {
    static String s1 = new String("Hello");
    static StringBuffer s2 = new StringBuffer("Hello");
    static StringBuilder s3 = new StringBuilder("Hello");

    public static void stringWrapperMethods() {
        System.out.printf("%s -> %s\n", s1.hashCode(), s1.concat(" world").hashCode()); // change
        System.out.printf("%s -> %s\n", s2.hashCode(), s2.append(" world").hashCode()); // no change
        System.out.printf("%s -> %s\n", s3.hashCode(), s3.append(" world").hashCode()); // no change

        System.out.printf("len - %s, cap - %s\n", s2.length(), s2.capacity());
        System.out.printf("len - %s, cap - %s\n", s3.length(), s3.capacity());
    }
}
