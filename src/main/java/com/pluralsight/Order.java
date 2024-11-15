package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();
    private double totalCost;
    private OrderNumber orderNumber;

    public Order(OrderNumber orderNumber, List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.orderNumber = orderNumber;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
        this.totalCost = getTotalCost();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
        totalCost = getTotalCost();
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
        totalCost = getTotalCost();
        //update total cost here
    }

    public void addChips(Chips chip) {
        chips.add(chip);
        //this is not important v
        totalCost = getTotalCost();

    }

    public void displayOrderSummary() {
        //do stuff
    }

    private double getTotalCost() {
        totalCost = 0;
        for (Sandwich sandwich : sandwiches) {
            totalCost += sandwich.getTotalCostOfSandwich();//make method
        } for (Drink drink : drinks) {
            totalCost += drink.getCostOfDrink();
        } for (Chips chip : chips) {
            totalCost += chip.getCostOfChips();
        }
        return totalCost;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(orderNumber.getNameOfCustomer()).append("\n");

        for (Sandwich sandwich : sandwiches) {
            stringBuilder.append(sandwich.toString()).append("\n");
        }
        for (Drink drink : drinks) {
            stringBuilder.append(drink.toString()).append("\n");
        }
        for (Chips chip : chips) {
            stringBuilder.append(chip.toString()).append("\n");
        }
        stringBuilder.append("Your total!: $").append(calculateTotal(this)).append("\n");
        return stringBuilder.toString();
    }
    public static double calculateTotal(Order order) {
        double total = 0.0;

        for (Sandwich sandwich : order.getSandwiches()) {
            total += sandwich.getTotalCostOfSandwich();
        }
        for (Drink drink : order.getDrinks()) {
            total += drink.getCostOfDrink();
        }
        for (Chips chip : order.getChips()) {
            total += chip.getCostOfChips();
        }
        return total;
    }
    public OrderNumber getOrderNumber() {
        return orderNumber;
    }
    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }
    public List<Drink> getDrinks() {
        return drinks;
    }
    public List<Chips> getChips() {
        return chips;
    }
    public void setDrink(List<Drink> drink) {
        this.drinks = drink;
    }
    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }
    public void setOrderNumber(OrderNumber orderNumber) {
        this.orderNumber = orderNumber;
    }
}
