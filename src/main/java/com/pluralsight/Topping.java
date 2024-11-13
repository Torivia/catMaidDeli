package com.pluralsight;

public interface class Topping {
    protected String nameOfTopping;
    protected double costOfTopping;

    public Topping(String nameOfTopping, String sandwichSize) {
        this.nameOfTopping = nameOfTopping;
    }

    public void setCostOfTopping(double costOfTopping) {
        this.costOfTopping = costOfTopping;
    }

    public double additionalCharge(String sandwichSize, double ) {
        return 5.5;
    }

    public String getNameOfTopping() {
        return nameOfTopping;
    }
    //IMPORTANT: There is no getter here for costOfTopping
}

