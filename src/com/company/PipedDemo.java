package com.company;

import java.io.*;

class PipedProducer extends Thread {
    OutputStream os;

    public PipedProducer(OutputStream os) {
        this.os = os;
    }

    public void run() {
        int count = 1;
        //noinspection InfiniteLoopStatement
        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer " + count);
                System.out.flush();
                //noinspection BusyWait
                Thread.sleep(10);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}

class PipedConsumer extends Thread {
    InputStream is;

    public PipedConsumer(InputStream is) {
        this.is = is;
    }

    public void run() {
        int x = 0;

        //noinspection InfiniteLoopStatement
        while (true) {
            try {
                x = is.read();
                System.out.println("Consumer: " + x);
                System.out.flush();
                //noinspection BusyWait
                Thread.sleep(10);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PipedDemo {
    public static void pipedStream() throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        PipedProducer p = new PipedProducer(pos);
        PipedConsumer c = new PipedConsumer(pis);

        p.start();
        c.start();
    }
}









