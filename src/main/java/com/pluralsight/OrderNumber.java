package com.pluralsight;

public class OrderNumber {
    private int actualNumOfOrder;
    private String nameOfCustomer;

    public OrderNumber(int actualNumOfOrder, String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
        this.actualNumOfOrder = actualNumOfOrder;
    }

    public int getActualNumOfOrder() {
        return actualNumOfOrder;
    }
    public String getNameOfCustomer() {
        return nameOfCustomer;
    }
}
