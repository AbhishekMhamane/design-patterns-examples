package composite_pattern;

public class Main{
  public static void main(String[] args) {

    MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");

    // parent menu
    MenuComponent callMenus = new Menu("ALL MENUS", "All menus combined");

    // add submenu types
    callMenus.add(pancakeHouseMenu);
    callMenus.add(dinerMenu);

    dinerMenu.add(new MenuItem("Butter Paneer", "Panjabi famous butter paneer", true, 3.89));
    dinerMenu.add(new MenuItem("Butter Nan", "Panjabi famous butter Nan", true, 2.89));

    pancakeHouseMenu.add(new MenuItem("Paneer Dosa", "South Indian famous Paneer Dosa", true, 2.99));
    pancakeHouseMenu.add(new MenuItem("Idly", "South Indian famous Idly", true, 2.99));

    Waitress waitress = new Waitress(callMenus);
    waitress.printMenu();

  }
}