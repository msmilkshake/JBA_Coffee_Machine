package machine;

public class Machine {
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;
    
    private enum Drink {
        ESPRESSO(250, 0, 16, 4),
        LATTE(350, 75, 20, 7),
        CAPPUCCINO(200, 100, 12, 6);
        
        private final int water;
        private final int milk;
        private final int beans;
        private final int price;
        
        Drink(int water, int milk, int beans, int price) {
            this.water = water;
            this.milk = milk;
            this.beans = beans;
            this.price = price;
        }
    }
    
    public String serveDrink(int drinkNo) {
        Drink drink = Drink.values()[drinkNo];
        if (water < drink.water) {
            return "water";
        }
        if (milk < drink.milk) {
            return "milk";
        }
        if (beans < drink.beans) {
            return "coffee beans";
        }
        if (cups == 0) {
            return "disposable cups";
        }
        water -= drink.water;
        milk -= drink.milk;
        beans -= drink.beans;
        money += drink.price;
        --cups;
        return null;
    }
    
    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }
    
    public int takeMoney() {
        int money = this.money;
        this.money = 0;
        return money;
    }
    
    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                "$" + money + " of money";
    }
}
