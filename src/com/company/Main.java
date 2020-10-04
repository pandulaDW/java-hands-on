package com.company;

public class Main {

    public static void main(String... args) {
        CoffeeMachine machine = CoffeeMachine.getInstance();
        machine.setCoffeeQuantity(3f);
        System.out.println(machine.getCoffeeQuantity());

        CoffeeMachine machine2 = CoffeeMachine.getInstance();
        System.out.println(machine2.getCoffeeQuantity());
    }
}