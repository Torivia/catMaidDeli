package com.pluralsight;

import java.util.Arrays;
import java.util.List;

public class ToppingDatabase {
    //constants
    public static final List<String> DEFAULT_TOPPINGS = Arrays.asList("lettuce",
            "peppers",
            "onions",
            "tomatoes",
            "jalapenos",
            "cucumbers",
            "pickles",
            "guacamole",
            "mushrooms");
    public static final List<String> SAUCE_TOPPINGS = Arrays.asList("mayo",
            "mustard",
            "ketchup",
            "ranch",
            "thousand islands",
            "vinaigrette");
    public static final List<String> SIDES = Arrays.asList("sauce",
            "au jus");

    public static final List<String> PREMIUM_MEAT_TOPPINGS = Arrays.asList("steak",
            "ham",
            "salami",
            "roast beef",
            "chicken",
            "bacon");
    public static final List<String> PREMIUM_CHEESE_TOPPINGS = Arrays.asList("swiss",
            "american",
            "provolone",
            "cheddar");

    //how to check if topping is premium..MAKE A METHOD
    public static boolean isPremiumTopping(String nameOfTopping) {
        return isMeatTopping(nameOfTopping) || isCheeseTopping(nameOfTopping);
    }
    public static boolean isMeatTopping(String nameOfTopping){
        return PREMIUM_MEAT_TOPPINGS.contains(nameOfTopping);
    }
    public static boolean isCheeseTopping(String nameOfTopping){
        return PREMIUM_CHEESE_TOPPINGS.contains(nameOfTopping);
    }
    //how to check if topping is normal....MAKE A METHOD!!!
    public static boolean isDefaultTopping(String nameOfTopping) {
        return DEFAULT_TOPPINGS.contains(nameOfTopping);
    }
}
