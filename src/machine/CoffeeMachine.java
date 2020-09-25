package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final int WATER = 200;
    private static final int MILK = 50;
    private static final int BEANS = 15;
    
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Write how many ml " +
                "of water the coffee machine has:");
        int avlbWater = scn.nextInt();
        System.out.println("Write how many ml of " +
                "milk the coffee machine has:");
        int avlbMilk = scn.nextInt();
        System.out.println("Write how many grams of " +
                "coffee beans the coffee machine has:");
        int avlbBeans = scn.nextInt();
        System.out.println("Write how many " +
                "cups of coffee you will need:");
        int numOfCoffees = scn.nextInt();
        
        int possibleCoffees = Math.min(Math.min(
                avlbWater / WATER,
                avlbMilk / MILK),
                avlbBeans / BEANS);
        
        if (possibleCoffees < numOfCoffees) {
            System.out.println("No, I can make only " +
                    possibleCoffees + " cup(s) of coffee");
        } else if (possibleCoffees == numOfCoffees) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee " +
                    "(and even " + (possibleCoffees - numOfCoffees) +
                    " more than that)");
        }
    }
}
