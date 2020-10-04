package com.company;

import java.util.Arrays;

public class MultiDimArrays {
    public static void declareMultiArrays() {
        int[][] arr1 = new int[3][4]; // 3 rows, 4 cols
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        // jagged arrays (different col widths)
        int[][] arr3 = new int[3][];
        arr3[0] = new int[]{1, 2, 3, 4};
        arr3[1] = new int[]{2, 3, 5, 6, 7, 1};
        arr3[2] = new int[]{12, 21, 3, 4};
    }

    public static void displayMatrix(int[][] arr) {
        for (int[] row : arr) {
            System.out.println();
            for (int col : row) {
                System.out.printf("%5d", col);
            }
        }
    }

    public static int[][] matrixAddition(int[][] arr1, int[][] arr2) {
        int nRows = arr1.length;
        int nCols = arr1[0].length;
        int[][] newArr = new int[nRows][nCols];
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                newArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return newArr;
    }

    public static int vectorDotProduct(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i] * arr2[i];
        }
        int sum = 0;
        for (int elem : newArr) {
            sum += elem;
        }
        return sum;
    }

    public static int[] getAllColumnValues(int[][] arr, int column) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i][column];
        }
        return newArr;
    }

    public static int[][] matrixMultiplication(int[][] arr1, int[][] arr2) {
        if (arr1[0].length != arr2.length) {
            throw new ArithmeticException("No of cols of first matrix should " +
                    "equal to the no of rows of second matrix");
        }
        int nRows = arr1.length;
        int nCols = arr2[0].length;
        int[][] newArr = new int[nRows][nCols];
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                newArr[i][j] = vectorDotProduct(arr1[i], getAllColumnValues(arr2, j));
            }
        }
        return newArr;
    }

    public static String[] sortArray(String[] arr) {
        String[] sortedArr = new String[arr.length];
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);
        return sortedArr;
    }
}








