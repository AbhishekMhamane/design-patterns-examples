package decorator_pattern;

//Beverage is nothing but Coffee
public abstract class Coffee {
    String description = "Empty beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
    
}
