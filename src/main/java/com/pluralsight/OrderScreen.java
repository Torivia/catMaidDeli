package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

//IMPORTANT: remember teachers feedback, make sure to add "break;" after switch cases.
public class OrderScreen {
    private Order currentOrder;
    Scanner scanner = new Scanner(System.in);

    public OrderScreen() {
        this.currentOrder = new Order();
    }

    public void display() {
        int choice;
        do {
            System.out.println("Yippee, great choice x3! What would you like to add now?\n" +
                    "1) Add Sandwich\n" +
                    "2) Add Drink\n" +
                    "3) Add Chips\n" +
                    "4) Checkout\n" +
                    "0) Cancel Order");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    processAddSandwich();
                    break;
                case 2:
                    processAddDrink();
                    break;
                case 3:
                    processAddChips();
                    break;
                case 4:
                    processCheckout();
                    break;
                case 0:
                    System.out.println(":c we'll miss you...bye bye..");
                    break;
                default:
                    System.out.println("*Checking notes* hm...that's not an option, please try again! >_o");

            }
        } while (choice != 0);
    }

    //add sandwich :3
    public void processAddSandwich() {
        int choice;
        String sandwichSizeForThisOrder;
        String breadTypeForThisOrder;
        ArrayList<Topping> meatToppingListForThisOrder = new ArrayList<>();
        ArrayList<Topping> cheeseToppingListForThisOrder = new ArrayList<>();
        ArrayList<Topping> regularToppingListForThisOrder = new ArrayList<>();
        ArrayList<Topping> sauceToppingListForThisOrder = new ArrayList<>();
        ArrayList<Topping> sideListForThisOrder = new ArrayList<>();
        //ask questions here about what the user would want!
        System.out.println("Yum, okay! And what size would you like for this sandwich to be?\n" +
                "1) 4\"\n" +
                "2) 8\"\n" +
                "3) 12\"\n");
        choice = scanner.nextInt();
        while(true) {
            switch (choice) {
                case 1:
                    sandwichSizeForThisOrder = "4\"";
                    break;
                case 2:
                    sandwichSizeForThisOrder = "8\"";
                    break;
                case 3:
                    sandwichSizeForThisOrder = "12\"";
                    break;
                default:
                    System.out.println("That's not an option, sorry!");
                    choice = scanner.nextInt(); // Prompt for a valid choice
                    continue;
            } break;
        }

        System.out.println("Great choice :D! What kind of bread type would you like?\n" +
                "1)White\n" +
                "2)Whea\nt" +
                "3)Rye\n" +
                "4)Wrap\n");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                breadTypeForThisOrder = "White";
                break;
            case 2:
                breadTypeForThisOrder = "Wheat";
                break;
            case 3:
                breadTypeForThisOrder = "Rye";
                break;
            case 4:
                breadTypeForThisOrder = "Wrap";
                break;
            default:
                System.out.println("That's not an option, defaulting to 'White'.");
                breadTypeForThisOrder = "White";
                break;
        }

        //add switch statement here
        System.out.println("What kind of meat(s) would you like?\n" +
                "1)Steak\n" +
                "2)Ham\n"+
                "3)Salami\n" +
                "4)Roast beef\n"+
                "5)Chicken\n"+
                "6)Bacon\n");
        //switch statement here
        System.out.println("What kind of cheese(s) would you like?\n" +
                //add cheeses here
                );
        //switch statement here
        System.out.println("What regular toppings would you like?\n" +
                //add regular toppings here
                );
        //switch statement here
        System.out.println("What kind of sauce(s) would you like?\n" +
                //sauces here
                );
        //switch statement here

        //use switch/if statement to make sure they dont name anything that's unavailable.
    }

    //add drink :3
    public void processAddDrink() {
        //ask questions about what size drink, what flavor, here!
        //use switch/if statement to make sure they dont name anything that's unavailable.
        //if there is an upcharge, mention it
    }

    //add chips :3
    public void processAddChips() {
        //ask what flavor! (out of available options)
        //use switch/if statement to make sure they dont name anything that's unavailable.
    }
    public void processCheckout() {
        int checkoutChoice;
        System.out.println("Okey dokey! This is it!:D");
        do {
            currentOrder.displayOrderSummary();
            System.out.println("Are you super duper suuuure this is what you wanted :3?\n" +
                    "Yes - 1\n" +
                    "No - 0");
            checkoutChoice = scanner.nextInt();
            switch (checkoutChoice) {
                case 1:
                    currentOrder.saveReceipt();
                    System.out.println("Thank you for ordering here >_< have a great day :3!!!");


                    //IMPORTANT:find out how you're gonna end the code here
                case 0:
                    System.out.println("silly goose :3");
                    break;
            }
        } while (checkoutChoice != 0);


    }
}
