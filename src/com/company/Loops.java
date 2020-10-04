package com.company;

public class Loops {
    public static void displayMultiplicationTable(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %2d = %d\n", num, i, num * i);
        }
    }

    public static int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static long factorial(int num) {
        if (num < 1) {
            return 0;
        }
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int reverseNumber(int num) {
        String[] numArray = Integer.toString(num).split("");
        String[] reversedArray = new String[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            reversedArray[i] = numArray[numArray.length - (i + 1)];
        }
        return Integer.parseInt(String.join("", reversedArray));
    }

    public static void displayNumberInWords(int number) {
        String[] numArray = Integer.toString(number).split("");
        for (String num : numArray) {
            switch (num) {
                case "0" -> System.out.print("zero ");
                case "1" -> System.out.print("one ");
                case "2" -> System.out.print("two ");
                case "3" -> System.out.print("three ");
                case "4" -> System.out.print("four ");
                case "5" -> System.out.print("five ");
                case "6" -> System.out.print("six ");
                case "7" -> System.out.print("seven ");
                case "8" -> System.out.print("eight ");
                case "9" -> System.out.print("nine ");
            }
        }
    }

    public static void arithmeticProgression(int number, int diff) {
        int next = number;
        for (int i = 0; i < 20; i++) {
            System.out.print(next + ", ");
            next += diff;
        }
    }

    public static void geometricProgression(int initial, int ratio) {
        double next = initial;
        for (int i = 1; i < 20; i++) {
            System.out.print((int) next + ", ");
            next = initial * Math.pow(ratio, i);
        }
    }

    public static int[] fibonacciSequence(int length) {
        int[] fibArray = new int[length];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i < length; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray;
    }
}








