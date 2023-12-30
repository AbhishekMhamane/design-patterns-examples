package creational.factory_pattern;

public class RunMe {

    public static void main(String args[]){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chStore = new ChicagoPizzaStore();

        Pizza p1 = nyStore.orderPizza("cheese");
        System.out.println("NY style pizza ordered : " + p1.getName());

        System.out.println("--------------------------------------------");

        Pizza p2 = chStore.orderPizza("pepperoni");
        System.out.println("Chicago style pizza ordered : " + p2.getName());

    }
}
