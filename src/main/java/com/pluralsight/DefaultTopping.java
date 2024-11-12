package com.pluralsight;

public class DefaultTopping {
    public DefaultTopping(String nameOfDefaultTopping) {
        super(nameOfDefaultTopping);
    }


    @Override
    public double additionalCharge(String sandwichSize) {
        return 0.0;
        }
    }

