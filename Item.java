public class Item {
    private String itemName;
    private String itemType;
    private String itemOwner;

    public Item(String itemName, String itemType, String itemOwner) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemOwner = itemOwner;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName + ", Type: " + itemType + ", Owner: " + itemOwner);
    }

    public void setItem(String itemName, String itemType, String itemOwner) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemOwner = itemOwner;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemOwner() {
        return itemOwner;
    }
}
