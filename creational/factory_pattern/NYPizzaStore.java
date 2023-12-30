package creational.factory_pattern;

public class NYPizzaStore extends PizzaStore{
   // Factory method
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
        else return null;
    }
}
