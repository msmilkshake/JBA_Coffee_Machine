package machine;

import java.util.Scanner;

public class TextUI {
    private final Scanner scn;
    private final Machine machine = new Machine();
    
    public TextUI(Scanner scn) {
        this.scn = scn;
    }
    
    public void start() {
        boolean runFlag = true;
        while (runFlag) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scn.nextLine();
            System.out.println();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    System.out.println(machine);
                    break;
                case "exit":
                    runFlag = false;
                    break;
                default:
                    break;
            }
            if (runFlag) {
                System.out.println();
            }
        }
    }
    
    private void buy() {
        System.out.println("What do you want to buy? " +
                "1 - espresso, " +
                "2 - latte, " +
                "3 - cappuccino, " +
                "back - to main menu:");
        String action = scn.nextLine();
        String missingIngredient = null;
        switch (action) {
            case "1":
                missingIngredient = machine.serveDrink(0);
                break;
            case "2":
                missingIngredient = machine.serveDrink(1);
                break;
            case "3":
                missingIngredient = machine.serveDrink(2);
                break;
            case "back":
                return;
            default:
                break;
        }
        if (missingIngredient == null) {
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Sorry, not enough " + missingIngredient + "!");
        }
    }
    
    private void fill() {
        System.out.println("Write how many ml " +
                "of water do you want to add:");
        int water = scn.nextInt();
        System.out.println("Write how many ml of " +
                "milk do you want to add:");
        int milk = scn.nextInt();
        System.out.println("Write how many grams of " +
                "coffee beans do you want to add:");
        int beans = scn.nextInt();
        System.out.println("Write how many disposable cups " +
                "of coffee do you want to add:");
        int cups = scn.nextInt();
        scn.nextLine();
        machine.fill(water, milk, beans, cups);
    }
    
    private void take() {
        System.out.println("I gave you $" + machine.takeMoney());
    }
}
