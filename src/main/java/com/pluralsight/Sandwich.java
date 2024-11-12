package com.pluralsight;

import java.util.ArrayList;

public class Sandwich {
    private String breadType;
    private String size;
    private boolean isToasted;
    private List<Topping> toppings = new ArrayList<>();

    public Sandwich(String breadType, String size, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.isToasted = isToasted;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateCost() {
        //calculate cost based on size and toppings
        return 0.0;
    }
}
