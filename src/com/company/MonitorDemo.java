package com.company;

// You can wrap a critical section by a synchronized block or you can add it to an entire method

class MyData {
    synchronized public void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    MyData d;

    public MyThread1(MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.display("Hello World ");
    }
}

class MyThread2 extends Thread {
    MyData data;

    public MyThread2(MyData data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.display("Welcome All ");
    }
}


