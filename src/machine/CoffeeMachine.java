package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final int WATER = 200;
    private static final int MILK = 50;
    private static final int BEANS = 15;
    
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");
        int numOfCoffees = scn.nextInt();
        System.out.println("For " + numOfCoffees +
                " cups of coffee you will need:\n" +
                numOfCoffees * WATER + " ml of water\n" +
                numOfCoffees * MILK + " ml of milk\n" +
                numOfCoffees * BEANS + " g of coffee beans");
    }
}
