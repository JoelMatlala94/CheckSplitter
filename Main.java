import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the item name:");
        String itemName = sc.nextLine();

        System.out.println("Enter the item type:");
        String itemType = sc.nextLine();

        System.out.println("Enter the item owner:");
        String itemOwner = sc.nextLine();

        Item newItem = new Item(itemName, itemType, itemOwner);
        itemList.add(newItem);

        System.out.println("\nItem added successfully!");
        newItem.displayItem();

        sc.close();
    }
}
