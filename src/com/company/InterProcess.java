package com.company;

public class InterProcess {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = v;
        flag = false;
        notify();

    }

    synchronized public int get() {
        int x = 0;
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        x = value;
        flag = true;
        notify();
        return x;
    }

}

class Producer extends Thread {
    InterProcess data;

    public Producer(InterProcess data) {
        this.data = data;
    }

    public void run() {
        int count = 1;
        while (true) {
            data.set(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    InterProcess data;

    public Consumer(InterProcess data) {
        this.data = data;
    }

    public void run() {
        int value;
        while (true) {
            value = data.get();
            System.out.println("Consumer: " + value);
        }
    }
}









