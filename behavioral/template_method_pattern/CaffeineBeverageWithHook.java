package behavioral.template_method_pattern;

// Algorithm used template method pattern
public abstract class CaffeineBeverageWithHook {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    // added hook
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  abstract void brew();
  abstract void addCondiments();
  void boilWater() {
    System.out.println("Boiling water");
  }
  void pourInCup() {
    System.out.println("Pouring into cup");
  }
  boolean customerWantsCondiments() {
    return true;
  }
}
