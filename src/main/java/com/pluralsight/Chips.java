package com.pluralsight;

public class Chips {
    private String flavorOfChips;
    private double costOfChips;

    public Chips(String flavorOfChips, double costOfChips) {
        this.flavorOfChips = flavorOfChips;
        this.costOfChips = 1.50;
    }
    public double getCostOfChips() {
        return costOfChips;
    }
    public String getFlavorOfChips() {
        return flavorOfChips;
    }
}
