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
        this.extraPremiumTopping = additionalCharge(sandwichSize, premiumType);

    }
@Override
    private double additionalCharge(String sandwichSize, String premiumType, boolean isExtra) {
        double baseCost = 0.0;
        double extraCost = 0.0;

        switch (sandwichSize) {
            case "4\"":
                //condition ? value_if_true : value_if_false
                if (premiumType.equals("Meat")) {
                    baseCost = 1.00;
                    extraCost = 0.50;
                } else if (premiumType.equals("Cheese")) {
                    baseCost = 0.75;
                    extraCost = 0.30;
                }
                break;
            case "8\"":
                if (premiumType.equals("Meat")) {
                    baseCost = 2.00;
                    extraCost = 1.00;
                } else if (premiumType.equals("Cheese")) {
                    baseCost = 1.50;
                    extraCost = 0.60;
                }
                break;
            case "12\"":
                if (premiumType.equals("Meat")) {
                    baseCost = 3.00;
                    extraCost = 1.50;
                } else if (premiumType.equals("Cheese")) {
                    baseCost = 2.25;
                    extraCost = 0.90;
                }
                break;
            default:
                baseCost = 1.00;
                extraCost = 0.50;
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
