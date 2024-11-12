package com.pluralsight;
import java.util.*;

public class SandwichOrder {
    String name;
    boolean vegetarian;
    double price;
    int popularity;
    List<String> ingredients; //This is making a list of ingredients

    SandwichOrder(String name, boolean vegetarian, double price, int popularity, List<String> ingredients) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
        this.popularity = popularity;
        this.ingredients = ingredients;
    }
    @Override
    public String toString() {
        return "Your sandwich order:\n" +
                "Name: '" + name + "'\n" +
                "vegetarian: " + vegetarian + "\n" +
                " price: " + price + "\n" +
                "popularity: " + popularity + "\n" +
                "ingredients: " + ingredients
                ;
    }


}
