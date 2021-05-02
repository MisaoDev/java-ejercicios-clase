package sapo.saposlagartos.game;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class InventoryItem {
  
  private int position;
  private int amount;
  private int itemID;

  public InventoryItem(int position, int amount, int itemID) {
    this.position = position;
    this.amount = amount;
    this.itemID = itemID;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getItemID() {
    return itemID;
  }

  public void setItemID(int itemID) {
    this.itemID = itemID;
  }
  
  
  
}
