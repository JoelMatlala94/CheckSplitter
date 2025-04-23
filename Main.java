import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();
        boolean answer = true;
        String Choice = "";
        System.out.println("Welcome to the Check Splitter");
        while(answer){
            System.out.println("1 Add an item");
            System.out.println("2 Remove an item");
            System.out.println("3 Display Items");
            System.out.println("4 Closeout");
            System.out.println("5 Exit");

            Choice = sc.nextLine();

            switch (Choice) {
                case "1":
                    itemList.add(addItem(sc)); // pass scanner again
                    break;

                case "2":
                    
                    break;

                case "3":
                    showItems(itemList);
                    break;

                case "4":
                    // closeout logic here
                    break;

                case "5":
                    System.out.println("Exiting Software");
                    answer = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        sc.close();
    }

    public static Item addItem(Scanner sc){
        System.out.println("Enter the item name:");
        String itemName = sc.nextLine();

        System.out.println("Enter the item quantity:");
        int itemQuant = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter the item price:");
        double itemPrice = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter the item owner:");
        String itemOwner = sc.nextLine();

        Item newItem = new Item(itemName, itemQuant, itemPrice, itemOwner);

        System.out.println("\nItem added successfully!");
        newItem.displayItem();

        return newItem;
    }

    public static void showItems(ArrayList<Item> items){
        for(Item entry : items){
           entry.displayItem();
        }
    }
}
