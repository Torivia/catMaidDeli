package com.pluralsight;
import java.util.*;
import java.util.stream.*;

public class SandwichOrderManager {
    public static void main(String[] args) {
        List<SandwichOrder> orders = Arrays.asList(
                new SandwichOrder("Veggie Delight", true, 5.99, 2, Arrays.asList("lettuce", "tomato", "cucumber")),
                new SandwichOrder("Turkey Club", false, 7.99, 3, Arrays.asList("turkey", "bacon", "lettuce", "tomato")),
                new SandwichOrder("BLT", false, 6.49, 1, Arrays.asList("bacon", "lettuce", "tomato")),
                new SandwichOrder("Grilled Cheese", true, 4.99, 4, Arrays.asList("cheese", "bread", "butter")),
                new SandwichOrder("Chicken Salad", false, 8.99, 5, Arrays.asList("chicken", "lettuce", "mayo"))
        );
        // Example 1: Filtering specific orders (e.g., vegetarian orders)
        List<SandwichOrder> vegetarianOrders = orders.stream()
                .filter(order -> order.vegetarian)
                .collect(Collectors.toList());
        System.out.println("Vegetarian Orders:");
        vegetarianOrders.forEach(System.out::println);

        //task 1
        List<SandwichOrder> getGlutenFreeOrders = orders.stream()
                .filter(order -> order.ingredients.contains("bread"))
                .filter(order -> order.price > 6.00)
                .collect(Collectors.toList());
        System.out.println("Gluten Free Orders over $6!");
        getGlutenFreeOrders.forEach(System.out::println);

        //exercise 2
        long countVegetarianOrders = orders.stream()
                .filter(order -> order.vegetarian)
                .count();
        System.out.println("There are " + countVegetarianOrders + " vegetarian orders! :3");

        long ordersWithLettuceAndTomato = orders.stream()
                .filter(order -> order.ingredients.contains("lettuce")&&order.ingredients.contains("tomato"))
                .count();
        System.out.println("there are " + ordersWithLettuceAndTomato + "orders with lettuce and tomato!");

        //exercise 3
        List<String> everySandwichPlusPopularityRank = orders.stream()
                .map(order -> order.name + " - Popularity: " + order.popularity)
                .collect(Collectors.toList());
        System.out.println("Sandwiches and their popularity score!:\n");
        everySandwichPlusPopularityRank.forEach(System.out::println);

        //exercise 4
        System.out.println("orders sorted by popularity(most to least popular): ");
        List<String> ordersSortedMostToLeastPopular = orders.stream()
                .sorted(Comparator.comparing(order->order.popularity))
                .map(order->order.name + " - Popularity: " + order.popularity)
                .collect(Collectors.toList());
        System.out.println("Sandwiches sorted by their popularity score!: " + ordersSortedMostToLeastPopular);


        // Example 2: Counting the number of orders that contain 'lettuce' as an ingredient
        long ordersWithLettuce = orders.stream()
                .filter(order -> order.ingredients.contains("lettuce"))
                .count();
        System.out.println("There are " + ordersWithLettuce + " orders with lettuce!");

        // Example 3: Using forEach to print each order name and price
        System.out.println("\nAll orders with their names and prices:");
        orders.stream().forEach(order -> System.out.println(order.name + " - $" + order.price));

        // Example 4: Sorting orders by price in descending order
        System.out.println("\nOrders sorted by price (high to low):");
        orders.stream()
                .sorted((o1, o2) -> Double.compare(o2.price, o1.price))
                .forEach(System.out::println);

        // Example 5: Calculating the total cost of all sandwiches ordered
        double totalCost = orders.stream()
                .map(order -> order.price)
                .reduce(0.0, Double::sum);
        System.out.println("\nTotal cost of all sandwiches: $" + totalCost);
    }

}


