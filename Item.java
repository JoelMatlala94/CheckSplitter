public class Item {
    private String itemName;
    private int itemQuant;
    private double itemPrice;
    private String itemOwner;

    public Item(String itemName, int itemQuant, double itemPrice, String itemOwner) {
        this.itemName = itemName;
        this.itemQuant = itemQuant;
        this.itemPrice = itemPrice;
        this.itemOwner = itemOwner;
    }

    public void displayItem() {
        System.out.println("#" + itemQuant + ", Item: " + itemName + ", Price: $" + itemPrice + ", Owner: " + itemOwner);
    }

    public void setItem(String itemName, int itemQuant, double itemPrice, String itemOwner) {
        this.itemName = itemName;
        this.itemQuant = itemQuant;
        this.itemPrice = itemPrice;
        this.itemOwner = itemOwner;

    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuant(){
        return itemQuant;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemOwner() {
        return itemOwner;
    }
}
