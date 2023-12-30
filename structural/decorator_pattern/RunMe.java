package decorator_pattern;

public class RunMe {
    
    public static void main(String[] args) {
        
        System.out.println("\n-- Decorator Pattern ---");
        Coffee beverage = new Espresso();
        beverage = new Mocha(beverage);
        // addeding double whip
        beverage = new Whip(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " "+beverage.cost());
    }
}
