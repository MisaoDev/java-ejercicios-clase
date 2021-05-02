package sapo.saposlagartos.game;

import java.util.ArrayList;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class Inventory {
  
  private ArrayList<InventoryItem> items;

  public Inventory(ArrayList<InventoryItem> items) {
    this.items = items;
  }
  
  public Inventory() {
    this(new ArrayList<InventoryItem> ());
  }

  public ArrayList<InventoryItem> getItems() {
    return items;
  }

  public void setItems(ArrayList<InventoryItem> items) {
    this.items = items;
  }
  
  public void add(InventoryItem item) {
    items.add(item);
  }
  
  public InventoryItem get(int position) {
    for (InventoryItem item : items) {
      if (item.getPosition() == position) {
        return item;
      }
    }
    return null;
  }
  
}
