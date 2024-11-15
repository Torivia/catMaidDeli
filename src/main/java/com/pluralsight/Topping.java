package com.pluralsight;

public class Topping {
    protected String nameOfTopping;


    public Topping(String nameOfTopping) {
        this.nameOfTopping = nameOfTopping;
    }

    public double additionalCharge(String sandwichSize, String premiumType, boolean isExtra) {
        return 5.5; //no
    }

    public String getNameOfTopping() {
        return nameOfTopping;
    }
}

