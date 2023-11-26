import decorator_pattern.Coffee;
import decorator_pattern.Espresso;
import decorator_pattern.Mocha;
import decorator_pattern.Whip;
import observer_pattern.WeatherStation;

public class Main {
    
    public static void main(String[] args) {

        //first

        //observer pattern
        System.out.println("\n-- Observer Pattern ---");
        WeatherStation.callWeatherStation();

        //decorator pattern
        System.out.println("\n-- Decorator Pattern ---");
        Coffee beverage = new Espresso();
        beverage = new Mocha(beverage);
        // addeding double whip
        beverage = new Whip(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " "+beverage.cost());
        
    }
}
