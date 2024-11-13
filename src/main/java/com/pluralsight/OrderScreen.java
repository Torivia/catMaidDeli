package com.pluralsight;
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
        //ask questions here about what the user would want!
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
