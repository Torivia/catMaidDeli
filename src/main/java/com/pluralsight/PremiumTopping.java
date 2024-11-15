package com.pluralsight;
//RETURN TO THIS CLASS, you are at the point where you are questioning
//whether or not you should make a nested if statement to differentiate the name of the topping,
//so if its cheese, itll send you to the case of charging you the amount it would if you ordered cheese

public class PremiumTopping extends Topping{
    private String premiumType;
    private double extraPremiumTopping;
    public PremiumTopping(String nameOfPremiumTopping, String sandwichSize, String premiumType) {
        super(nameOfPremiumTopping);
        this.premiumType = premiumType;
    }
@Override
    public double additionalCharge(String sandwichSize, String premiumType, boolean isExtra) {
        double baseCost = 0.0;
        double extraCost = 0.0;

        boolean addExtraCost = isExtra;

        switch (sandwichSize) {
            case "4\"":
                //condition ? value_if_true : value_if_false
                if (premiumType.equals("Meat")) {
                    if (addExtraCost) {
                        baseCost = 1.00;
                    } else {
                    extraCost = 0.50;
                    }
                } else if (premiumType.equals("Cheese")) {
                    if (addExtraCost) {
                        baseCost = 0.75;
                    } else {
                        extraCost = 0.30;
                    }
                }
                break;
            case "8\"":
                if (premiumType.equals("Meat")) {
                    if (addExtraCost) {
                        baseCost = 2.00;
                    } else {
                        extraCost = 1.00;
                    }
                } else if (premiumType.equals("Cheese")) {
                    if (addExtraCost) {
                        baseCost = 1.50;
                    } else {
                        extraCost = 0.60;
                    }
                }
                break;
            case "12\"":
                if (premiumType.equals("Meat")) {
                    if (addExtraCost) {
                        baseCost = 3.00;
                    } else {
                        extraCost = 1.50;
                    }
                } else if (premiumType.equals("Cheese")) {
                    if (addExtraCost) {
                        baseCost = 2.25;
                    } else {
                        extraCost = 0.90;
                    }
                }
                break;
            default:
                if (addExtraCost) {
                    baseCost = 1.00;
                } else {
                extraCost = 0.50;
                }
                break;
        }
        //isExtra will b
        return isExtra ? baseCost + extraCost : baseCost;
    }


//    @Override
//    public double additionalChargesByPremiumType(String nameOfPremiumTopping, String sandwichSize) {
//
//        switch (sandwichSize) {
//            case "4\"":
//                return 1.00;
//            case "8\"":
//                return 1.75;
//            case "12\"":
//                return 2.50;
//            default:
//                return 1.00;
//        }
//    }
    public String getPremiumType() {
        return premiumType;
    }
}
