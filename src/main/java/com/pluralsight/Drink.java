package com.pluralsight;

public class Drink {
    private String flavorOfDrink;
    private String sizeOfDrink;
    private double costOfDrink;

    public Drink(String flavorOfDrink, String sizeOfDrink) {
        this.flavorOfDrink = flavorOfDrink;
        this.sizeOfDrink = sizeOfDrink;
    }
    public double getCostOfDrink(String sizeOfDrink) {
        switch (sizeOfDrink) {
            case "Small":
                costOfDrink = 2.00;
            case "Medium":
                costOfDrink = 2.50;
            case "Large":
                costOfDrink = 3.00;
        }
        return costOfDrink;
    }
}
