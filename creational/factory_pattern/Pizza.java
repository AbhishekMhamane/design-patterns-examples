package creational.factory_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String sauce;
    List<String> toppings = new ArrayList<>();
    void prepare(){
        System.out.println("Preparing pizza " + name);
        System.out.println("Adding sauce");
        System.out.println("Adding toppings");

    }
    void bake(){
        System.out.println("Baking pizza");
    }
    void cut(){
        System.out.println("Cutting pizza");
    }
    void box(){
        System.out.println("Adding into a box");
    }
    public String getName(){
        return name;
    }
}
