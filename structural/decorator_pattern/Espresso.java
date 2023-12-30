package decorator_pattern;

public class Espresso extends Coffee{

    public Espresso(){
        description = "Espresso coffee";
    }

    public double cost() {
       return 1.99;
    }
    
}
