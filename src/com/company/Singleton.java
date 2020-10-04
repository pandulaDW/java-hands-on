package com.company;

// Only a single object should be created from a singleton class.
// make the constructor a private method, to avoid making more than one object
// create the single object within the class
// use a static public method to return the single object

class CoffeeMachine {
    private float coffeeQuantity;
    private float waterQuantity;

    static private CoffeeMachine machine = null;

    private CoffeeMachine() {
        coffeeQuantity = 1f;
        waterQuantity = 1f;
    }

    public static CoffeeMachine getInstance() {
        if (machine == null)
            machine = new CoffeeMachine();
        return machine;
    }

    public float getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(float coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }

    public float getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(float waterQuantity) {
        this.waterQuantity = waterQuantity;
    }
}

