package com.pluralsight;

public abstract class Topping {
    protected String nameOfTopping;
    protected double costOfTopping;

    public Topping(String nameOfTopping, String sandwichSize) {
        this.nameOfTopping = nameOfTopping;
    }

    public abstract double additionalCharge(String sandwichSize);

    public String getNameOfTopping() {
        return nameOfTopping;
    }

    public double getCostOfTopping() {
        return costOfTopping;
    }
}

