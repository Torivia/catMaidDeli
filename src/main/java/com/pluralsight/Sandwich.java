package com.pluralsight;

import java.util.ArrayList;

public class Sandwich {
    private String breadType;
    private String sandwichSize;
    private boolean isToasted;
    private ArrayList<Topping> toppings = new ArrayList<>();
    private ArrayList<Boolean> isExtraList = new ArrayList<>();

    public Sandwich(String breadType, String sandwichSize, boolean isToasted) {
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
        this.isToasted = isToasted;
    }
    public void addTopping(Topping topping, boolean isExtra) {
        toppings.add(topping);
        isExtraList.add(isExtra);
    }

    public void addToppingByName(String nameOfTopping) {
        Topping topping;

        if (ToppingDatabase.isDefaultTopping(nameOfTopping)) {
            topping = new DefaultTopping(nameOfTopping);
        } else if (ToppingDatabase.isMeatTopping(nameOfTopping)) {
            topping = new PremiumTopping(nameOfTopping, "Meat", sandwichSize);
        } else if (ToppingDatabase.isCheeseTopping(nameOfTopping)) {
            topping = new PremiumTopping(nameOfTopping, "Cheese", sandwichSize);
        } else {
            System.out.println("hmm...sorry, we don't serve " + nameOfTopping + " here :c");
            return;
        }
        toppings.add(topping);
    }

    public double calculateTotalToppingsCost() {
        //calculate cost based on size and toppings

        double total = 0.0;
        for (int i = 0; i < toppings.size(); i++) {
            Topping topping = toppings.get(i);
            total += topping.additionalCharge(sandwichSize);
        }
        return total;
    }
//    public double calculateTotalSandwich ()
}
