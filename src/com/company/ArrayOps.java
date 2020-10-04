package com.company;

import java.util.stream.IntStream;

public class ArrayOps {
    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int elem : arr) {
            max = Math.max(elem, max);
        }
        return max;
    }

    public static int secondMaxElement(int[] arr) {
        int max = ArrayOps.maxElement(arr);
        int secondMax = Integer.MIN_VALUE;
        for (int elem : arr) {
            if (elem == max)
                continue;
            secondMax = Math.max(elem, secondMax);
        }
        return secondMax;
    }

    public static int[] arrayRotation(int[] arr, boolean isLeft) {
        int[] arrCopy = new int[arr.length];

        if (isLeft)
            arrCopy[arr.length - 1] = arr[0];
        else
            arrCopy[0] = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            if (isLeft)
                arrCopy[i] = arr[i + 1];
            else
                arrCopy[i + 1] = arr[i];

        }
        return arrCopy;
    }

    public static int[] arrayInsert(int[] arr, int elem, int index) {
        int[] newArr = new int[arr.length];
        newArr[index] = elem;
        IntStream.range(0, index).forEach(i -> newArr[i] = arr[i]);
        IntStream.range(index + 1, arr.length).forEach(i -> newArr[i] = arr[i - 1]);
        return newArr;
    }

    public static int[] arrayRemove(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        IntStream.range(0, index).forEach(i -> newArr[i] = arr[i]);
        IntStream.range(index + 1, arr.length).forEach(i -> newArr[i - 1] = arr[i]);
        return newArr;
    }

    public static int[] arrayCopy(int[] arr) {
        int[] newArr = new int[arr.length];
        IntStream.range(0, arr.length).forEach(i -> newArr[i] = arr[i]);
        return newArr;
    }

    public static int[] arrayReverseCopy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - (i + 1)];
        }
        return newArr;
    }

    public static int[] arrayIncreaseSize(int[] arr, int len) {
        int[] newArr = new int[len];
        IntStream.range(0, arr.length).forEach(i -> newArr[i] = arr[i]);
        return newArr;
    }
}
