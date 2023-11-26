package decorator_pattern;

public class Mocha extends CondimentDecorator{

    public Mocha(Coffee beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", added mocha";
    }

    public double cost() {
       return beverage.cost() + .20;
    }
    
}
