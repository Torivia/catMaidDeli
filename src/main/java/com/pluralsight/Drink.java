package com.pluralsight;

public class Drink {
    private String flavorOfDrink;

    private double costOfDrink;

    public Drink(String flavorOfDrink, double priceOfDrink) {
        this.flavorOfDrink = flavorOfDrink;
        this.costOfDrink = priceOfDrink;
    }
    public double getCostOfDrink() {
        return costOfDrink;
    }
    @Override
    public String toString(){
        return "Drink: " + flavorOfDrink + ", $" + costOfDrink;
    }
}
