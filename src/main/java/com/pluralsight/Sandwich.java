package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String breadType;
    private String sandwichSize;
    private boolean isToasted;
    private List<Topping> toppings;
    private List<Sauces> sauces;
    private List<Sides> sides;
    private List<Boolean> isExtraList;
    private List<Topping> extras;
    private double totalCostOfSandwich;


    public Sandwich(String breadType, String sandwichSize, boolean isToasted, List<Topping> toppings) {
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
        this.isToasted = isToasted;
        this.toppings = toppings;
        this.isExtraList = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.sides = new ArrayList<>();
        this.extras = new ArrayList<>();
    }
    public void addTopping(Topping topping, boolean isExtra) {
        toppings.add(topping);
        isExtraList.add(isExtra);
    }

    public String getSandwichSize() {
        return sandwichSize;
    }
    public void addToppingByName(String nameOfTopping) {
        boolean isExtra = false;
        //in order to determine whether the topping has already been added to the order
        //
        for (Topping topping : toppings) {
            if (topping.getNameOfTopping().equalsIgnoreCase(nameOfTopping)) {
                isExtra = true;
                break;
            }
        }

        Topping topping;
        if (ToppingDatabase.isDefaultTopping(nameOfTopping)) {
            topping = new DefaultTopping(nameOfTopping);
        } else if (ToppingDatabase.isMeatTopping(nameOfTopping)) {
            topping = new PremiumTopping(nameOfTopping, sandwichSize,"Meat");
        } else if (ToppingDatabase.isCheeseTopping(nameOfTopping)) {
            topping = new PremiumTopping(nameOfTopping, sandwichSize,"Cheese");
        } else {
            System.out.println("hmm...sorry, we don't serve " + nameOfTopping + " here :c");
            return;
        }

        addTopping(topping, isExtra);

    }
    public void addExtraToppings(Topping topping) {
        extras.add(topping);
    }

//    public double calculateTotalToppingsCost() {
//        //calculate cost based on size and toppings
//
//        double total = 0.0;
//        for (int i = 0; i < toppings.size(); i++) {
//            Topping topping = toppings.get(i);
//            boolean isExtra = isExtraList.get(i);
//
//            if (topping instanceof PremiumTopping) {
//                total += ((PremiumTopping) topping).additionalCharge(sandwichSize, premiumType, isExtra);
//            } else {
//                total += topping.additionalCharge(sandwichSize);
//            }
//        }
//        return total;
//    }
    public double getTotalCostOfSandwich () {
        return totalCostOfSandwich;
    }
    @Override
    public String toString() {
        return sandwichSize + " sandwich on " + breadType + (isToasted ? " (toasted)" : "") +
                " with toppings: " + toppings.toString();
    }
}
