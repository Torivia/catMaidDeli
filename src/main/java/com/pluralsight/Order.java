package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Sandwich> sandwiches = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Chips> chips = new ArrayList<>();
    private double totalCost;
    private OrderNumber orderNumber;

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
        //UPDATE TOTAL COST HERE
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
        //update total cost here
    }

    public void addChips(Chips chip) {
        chips.add(chip);
        //""
    }

    public void displayOrderSummary() {
        //do stuff
    }

    public void saveReceipt() {
        //save order as receipt file
    }

}
