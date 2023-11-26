package decorator_pattern;

public class Whip extends CondimentDecorator{

    public Whip(Coffee beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
       return beverage.getDescription() + ", added Whip";
    }

    public double cost() {
        return beverage.cost() + .30;
    }
    
}
