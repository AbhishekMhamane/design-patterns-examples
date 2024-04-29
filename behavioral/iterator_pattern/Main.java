package behavioral.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Item> items = new ArrayList<>();
    Item i1 = new Item("item1", "item1 description");
    Item i2 = new Item("item2", "item2 description");
    Item i3 = new Item("item3", "item3 description");
    items.add(i1);
    items.add(i2);
    items.add(i3);

    Iterator<Item> iterator = ItemIterator.createIterator(items);

    while(iterator.hasNext()) {
      Item item = iterator.next();
      System.out.println(item.name + " : " + item.des);
    }

  }
}
