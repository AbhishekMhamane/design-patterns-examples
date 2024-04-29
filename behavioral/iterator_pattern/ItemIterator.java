package behavioral.iterator_pattern;

import java.util.List;
import java.util.NoSuchElementException;

public class ItemIterator implements Iterator<Item>{
  private int currentIndex = 0;
  private List<Item> items;

  public ItemIterator(List<Item> items) {
    this.items = items;
  }

  public static Iterator<Item> createIterator(List<Item> items) {
    return new ItemIterator(items);
  }

  @Override
  public boolean hasNext() {
    return currentIndex < items.size();
  }

  @Override
  public Item next() {
    if(!hasNext()) {
      throw new NoSuchElementException();
    }
    return items.get(currentIndex++);
  }
}
