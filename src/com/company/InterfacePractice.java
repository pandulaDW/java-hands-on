package com.company;

// Interfaces are used only to achieve runtime polymorphism

abstract class Phone {
    public void call() {
        System.out.println("Phone call");
    }

    public void sms() {
        System.out.println("Iphone sending SMS");
    }
}

interface ICamera {
    void click();

    void record();
}

interface IMusicPlayer {
    void play();

    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {

    @Override
    public void click() {
        System.out.println("Smart phone take photo");
    }

    @Override
    public void record() {
        System.out.println("Smart phone voice record");
    }

    @Override
    public void play() {
        System.out.println("Smart phone video play music");
    }

    @Override
    public void stop() {
        System.out.println("Smart phone stop music");
    }
}
