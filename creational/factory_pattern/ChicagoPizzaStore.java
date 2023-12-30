package creational.factory_pattern;

public class ChicagoPizzaStore extends PizzaStore{
    // Factory method
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else if(type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        else return null;
    }
}
