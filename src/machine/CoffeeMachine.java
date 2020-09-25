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
        printState();
        System.out.println("\nWrite action (buy, fill, take):");
        String action = scn.nextLine();
        
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
            default:
                break;
        }
        System.out.println();
        printState();
    }
    
    private static void buy() {
        System.out.println("What do you want to buy? " +
                "1 - espresso, " +
                "2 - latte, " +
                "3 - cappuccino:");
        int action = scn.nextInt();
        switch (action) {
            case 1:
                serveDrink(ESPRESSO);
                break;
            case 2:
                serveDrink(LATTE);
                break;
            case 3:
                serveDrink(CCINO);
                break;
            default:
                break;
        }
    }
    
    private static void serveDrink(int[] drink) {
        water -= drink[0];
        milk -= drink[1];
        beans -= drink[2];
        money += drink[3];
        --cups;
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
    }
    
    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    
    public static void printState() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money");
    }
}
