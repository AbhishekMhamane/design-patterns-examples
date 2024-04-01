package behavioral.template_method_pattern;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
  @Override
  void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }

  @Override
  public boolean customerWantsCondiments() {
    System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
    String answer = getUserInput();
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }

  private String getUserInput() {
    String answer = null;

    Scanner sc = new Scanner(System.in);
    answer = sc.nextLine();
    sc.close();

    if (answer == null) {
      return "no";
    }

    return answer;
  }


}
