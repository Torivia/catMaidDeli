package com.pluralsight;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//IMPORTANT: remember teachers feedback, make sure to add "break;" after switch cases.
public class OrderScreen {
    private Order currentOrder;
    int actualOrderNumber;
    Scanner scanner = new Scanner(System.in);

    public void display() {
        while (true) {
            System.out.println("Welcome to the maid cafe >_o!~ \n" +
                    "Let's start you off with an order :3\n" +
                    "1) New Order! omnomnomnom ^7^\n" +
                    "0) Exit :c");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    actualOrderNumber += 1;
                    OrderNumber orderNumber = addOrder(actualOrderNumber);
                    displayOrderScreen();
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0); // Exit the application completely (it wouldn't exit at first)
                default:
                    System.out.println("That's not an option! Plz try again ^_^");
            }
        }
    }

    public OrderNumber addOrder(int actualOrderNumber) {
        scanner.nextLine();
        System.out.println("May I take your name? :3");
        String nameOfCustomer = scanner.nextLine();
        System.out.println("Thanks, " + nameOfCustomer + " :D!");

        OrderNumber newOrder = new OrderNumber(actualOrderNumber, nameOfCustomer);
        return newOrder;
    }

    public void displayOrderScreen() {
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
        boolean isToasted;
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
        while (true) {
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
            }
            break;
        }

        System.out.println("Great choice :D! What kind of bread type would you like?\n" +
                "1)White\n" +
                "2)Wheat\n" +
                "3)Rye\n" +
                "4)Wrap");
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
        System.out.println("Would you like your sandwich toasted?\n" +
                "1) Yep!\n" +
                "0) Nope!");
        choice = scanner.nextInt();
        isToasted = (choice == 1);

        Sandwich sandwich = new Sandwich(breadTypeForThisOrder, sandwichSizeForThisOrder, isToasted, new ArrayList<>());


        do {
            System.out.println("Would you like to add meat?\n" +
                    "Steak\n" +
                    "Ham\n" +
                    "Salami\n" +
                    "Roast beef\n" +
                    "Chicken\n" +
                    "Bacon\n" +
                    "1) Yep!\n" +
                    "0) Nope!");
            //user input goes here v
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Okay! please type in what you would like. :D");
                    String meatChoice = scanner.nextLine();
                    PremiumTopping topping = new PremiumTopping(meatChoice, sandwichSizeForThisOrder, "Meat");
                    sandwich.addToppingByName(meatChoice);
                    scanner.nextLine();
                    //use additional charge here
                    System.out.println("and would you like to add extra meat to that? ^_^\n" +
                            "1) Yep!\n" +
                            "0) Nope!\n");
                    int doYouWantExtra = scanner.nextInt();
                    if (doYouWantExtra == 1) {
                        double extraCharge = topping.additionalCharge(sandwich.getSandwichSize(), "Meat", true);
                        sandwich.addExtraToppings(topping); //Add to extras
                        System.out.println("Added " + " with extra charge: $" + extraCharge);

                    }
                    //PremiumTopping premiumTopping = new PremiumTopping(meatChoice, sandwichSizeForThisOrder, "Meat");
                    break;
                case 0:
                    System.out.println("Okey dokey :D!");
                    break;
            }
        } while (choice != 0);


        System.out.println("Would you like any of these cheeses?\n" +
                "swiss\n" +
                "american\n" +
                "provolone\n" +
                "cheddar\n" +
                "1) Yes\n" +
                "0) No");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                scanner.nextLine();
                System.out.println("Okay! please type in what you would like. :D");
                String cheeseChoice = scanner.nextLine();
                PremiumTopping topping = new PremiumTopping(cheeseChoice, sandwichSizeForThisOrder, "Cheese");
                sandwich.addToppingByName(cheeseChoice);
                scanner.nextLine();
                //use additional charge here
                System.out.println("and would you like to add extra cheese to that? ^_^ \n" +
                        "1) Yep!\n" +
                        "0) Nope!");
                int doYouWantExtra = scanner.nextInt();
                if (doYouWantExtra == 1) {
                    double extraCharge = topping.additionalCharge(sandwich.getSandwichSize(), "Cheese", true);
                    sandwich.addExtraToppings(topping); //Add to extras
                    System.out.println("Added " + " with extra charge: $" + extraCharge);
                } else {
                    System.out.println("Okay :D");
                }
                break;
            case 0:
                System.out.println("Okey dokey :D!");
                break;
        } while (choice !=0);

        //switch statement here
        System.out.println("What regular toppings would you like?\n"+
                "lettuce\n" +
                "peppers\n" +
                "onions\n" +
                "tomatoes\n" +
                "jalapenos\n" +
                "cucumbers\n" +
                "pickles\n" +
                "guacamole\n" +
                "mushrooms" +
                "1) Yes" +
                "0) No");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                scanner.nextLine();
                System.out.println("Okay! please type in what you would like. :D");
                String regularChoice = scanner.nextLine();
                sandwich.addToppingByName(regularChoice);
                break;
            case 0:
                System.out.println("Okey dokey :D!");
                break;
        } while(choice !=0);
        //switch statement here
        System.out.println("What kind of sauce(s) would you like?\n" +
                "mayo\n" +
                "mustard\n" +
                "ketchup\n" +
                "ranch\n" +
                "thousand islands\n" +
                "vinaigrette");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                scanner.nextLine();
                System.out.println("Okay! please type in what you would like. :D");
                String sauceChoice = scanner.nextLine();
                sandwich.addToppingByName(sauceChoice);
                break;
            case 0:
                System.out.println("Okey dokey :D!");
                break;
        } while(choice !=0);
        //switch statement here

        //use switch/if statement to make sure they dont name anything that's unavailable.
    }

    //add drink :3
    public void processAddDrink() {
        //ask questions about what size drink, what flavor, here!
        //use switch/if statement to make sure they dont name anything that's unavailable.
        //if there is an upcharge, mention it
        System.out.println("Enter what drink size you'd like pls :3 (small, medium, large): ");
        String size = scanner.nextLine();
        double price;
        switch (size.toLowerCase()) {
            case "small":
                price = 2.00;
                break;
            case "medium":
                price = 2.50;
                break;
            case "large":
                price = 3.00;
                break;
            default:
                System.out.println("This size isn't available sorry :(. please try again");
                return;
        }
        System.out.print("What flavor would you like?");
        String flavorOfDrink = scanner.nextLine();
        Drink drink = new Drink(flavorOfDrink, price);
        currentOrder.addDrink(drink);
        System.out.println(drink.toString());
    }

    //add chips :3
    public void processAddChips() {
        //ask what flavor! (out of available options if i feel like making any)
        //use switch/if statement to make sure they dont name anything that's unavailable.
        System.out.println("What chips would you like?: ");
        String flavorOfChips = scanner.nextLine();
        Chips oneChipBag = new Chips(flavorOfChips);
        currentOrder.addChips(oneChipBag);
        System.out.println(oneChipBag.toString());
    }
    public void processCheckout() {
        int checkoutChoice;
        System.out.println("Okey dokey! This is it!:D");
        do {
            currentOrder.displayOrderSummary();
            System.out.println(currentOrder.toString());

            System.out.println("Are you super duper suuuure this is what you wanted :3?\n" +
                    "Yes - 1\n" +
                    "No - 0");
            checkoutChoice = scanner.nextInt();
            switch (checkoutChoice) {
                case 1:
                    receipt(currentOrder);
                    System.out.println("Thank you for ordering here >_< have a great day :3!!!");


                    //IMPORTANT:find out how you're gonna end the code here
                case 0:
                    System.out.println("silly goose :3");
                    break;
            }
        } while (checkoutChoice != 0);
    }
        private void receipt(Order order) {
            String folderName = "receipts";
            File folder = new File(folderName);
            if (!folder.exists()) {
                folder.mkdir();
            }
            String fileName = folderName + "/" + new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date()) + ".txt";
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(order.toString()); // Assuming your Order class has a meaningful toString() method
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
//        if(isExtra) {
//            total += extraCost;
//        } else {
//            total += baseCost;
//        }
        return isExtra ? baseCost + extraCost : baseCost;

    }
    }

