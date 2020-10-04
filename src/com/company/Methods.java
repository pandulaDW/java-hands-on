package com.company;

import java.util.stream.IntStream;

public class Methods {
    public static boolean checkIfPrime(int num) {
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0)
                return true;
        }
        return false;
    }

    // overloaded method for int
    public static int reverseElem(int num) {
        String[] strArray = String.valueOf(num).split("");
        String[] newArray = new String[strArray.length];
        for (int i = 1; i < strArray.length + 1; i++) {
            newArray[i - 1] = strArray[strArray.length - i];
        }
        return Integer.parseInt(String.join("", newArray));
    }

    // overloaded method for array
    public static int[] reverseElem(int[] arr) {
        int[] newArr = new int[arr.length];
        IntStream.range(1, arr.length + 1).forEach(i -> newArr[i - 1] = arr[arr.length - i]);
        return newArr;
    }

    public static boolean validate(String name) {
        return name.matches(".*?\\W.*");
    }

    public static boolean validate(int age) {
        return age > 3 && age < 15;
    }

    // variable arguments (var args parameter should be the last parameter)
    public static int getMax(int... args) {
        int max = Integer.MIN_VALUE;
        for (int arg : args) {
            if (arg > max)
                max = arg;  
        }
        return max;
    }

}



