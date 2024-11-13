package com.pluralsight;

public class DefaultTopping extends Topping{
    public DefaultTopping(String nameOfDefaultTopping) {
        super(nameOfDefaultTopping);//dont do this no more
    }


    @Override
    public double additionalCharge(String sandwichSize) {
        return 0.0;
        }
    }

