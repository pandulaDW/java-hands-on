package com.company;

// can have the main method in the extended class also

public class ThreadTest extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + " My thread");
            i++;
        }
    }
}

class RunnableTest implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}