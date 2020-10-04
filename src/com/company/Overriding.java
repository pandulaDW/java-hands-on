package com.company;

class TV {
    public void switchOn() {
        System.out.println("TV is switched ON");
    }

    public void changeChannel() {
        System.out.println("TV Channel is Changed");
    }
}

class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("Smart TV is switched ON");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart TV Channel is Changed");
    }

    public void browse() {
        System.out.println("Smart TV Browsing");
    }
}