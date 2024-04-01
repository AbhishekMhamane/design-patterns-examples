package behavioral.template_method_pattern;

public class Main {
  public static void main(String args[]){

    Tea tea = new Tea();
    System.out.println("\nMaking tea...");
    tea.prepareRecipe();

    CoffeeWithHook coffeeHook = new CoffeeWithHook();
    System.out.println("\nMaking coffee...");
    coffeeHook.prepareRecipe();
  }
}
