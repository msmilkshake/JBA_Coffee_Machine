package machine;

import java.util.Scanner;

public class CoffeeMachine {
    
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;
    
    //                             {coffee, milk, beans, price}
    private static final int[] ESPRESSO = {250, 0, 16, 4};
    private static final int[] LATTE = {350, 75, 20, 7};
    private static final int[] CCINO = {200, 100, 12, 6};
    
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
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
                    remaining();
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
    
    private static void buy() {
        System.out.println("What do you want to buy? " +
                "1 - espresso, " +
                "2 - latte, " +
                "3 - cappuccino, " +
                "back - to main menu:");
        String action = scn.nextLine();
        String result = null;
        switch (action) {
            case "1":
                result = serveDrink(ESPRESSO);
                break;
            case "2":
                result = serveDrink(LATTE);
                break;
            case "3":
                result = serveDrink(CCINO);
                break;
            case "back":
                return;
            default:
                break;
        }
        if (result == null) {
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Sorry, not enough " + result + "!");
        }
    }
    
    private static String serveDrink(int[] drink) {
        if (water < drink[0]) {
            return "water";
        }
        if (milk < drink[1]) {
            return "milk";
        }
        if (beans < drink[2]) {
            return "coffee beans";
        }
        if (cups == 0) {
            return "disposable cups";
        }
        water -= drink[0];
        milk -= drink[1];
        beans -= drink[2];
        money += drink[3];
        --cups;
        return null;
    }
    
    private static void fill() {
        System.out.println("Write how many ml " +
                "of water do you want to add:");
        water += scn.nextInt();
        System.out.println("Write how many ml of " +
                "milk do you want to add:");
        milk += scn.nextInt();
        System.out.println("Write how many grams of " +
                "coffee beans do you want to add:");
        beans += scn.nextInt();
        System.out.println("Write how many disposable cups " +
                "of coffee do you want to add:");
        cups += scn.nextInt();
        scn.nextLine();
    }
    
    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    
    public static void remaining() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                "$" + money + " of money");
    }
}
