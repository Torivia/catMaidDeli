package com.pluralsight;

import java.util.Arrays;
import java.util.List;

public class ToppingDatabase {
    //constants
    public static final List<String> DEFAULT_TOPPINGS = Arrays.asList("lettuce\n" +
            "peppers\n",
            "onions\n",
            "tomatoes\n",
            "jalepenos\n",
            "cucumbers\n",
            "pickles\n",
            "guacamole\n",
            "mushrooms");
    public static final List<String> PREMIUM_MEAT_TOPPINGS = Arrays.asList("steak\n",
            "ham\n",
            "salami\n",
            "roast beef\n",
            "chicken\n",
            "bacon\n");
    public static final List<String> PREMIUM_CHEESE_TOPPINGS = Arrays.asList("swiss\n",
            "american\n",
            "provolone\n",
            "cheddar\n");

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
