package com.pluralsight;

public class OrderScreen {
    private Order currentOrder;

    public OrderScreen() {
        this.currentOrder = new Order();
    }

    public void display() {
        System.out.println("Yippee, great choice x3! What would you like to add now?\n" +
                "1) Add Sandwich\n" +
                "2) Add Drink\n" +
                "3) Add Chips\n" +
                "4) Checkout\n" +
                "0) Cancel Order");
    }
}
