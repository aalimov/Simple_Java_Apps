//@author Alimov Alex
import java.util.Scanner;
public class ItemToPurchase{
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase() {
        itemName     = "none";
        itemPrice    = 0;
        itemQuantity = 0;
        itemDescription = "none";
    }

    //SET / GET ITEM NAME
    public void setName(String itemName){
        this.itemName = itemName;
    }
    public String getName(){
        return itemName;
    }

    //SET / GET ITEM DESCRIPTION
    public void setDescription(String itemDescription){
        this.itemDescription = itemDescription;
    }
    public String getDescription(){
        return itemDescription;
    }

    //PRINT ITEM DESCRIPTION
    public String printItemDescription(){
        return System.out.println(itemName + " " +itemDescription);
    }

    //SET / GET ITEM PRICE
    public void setPrice(int itemPrice){
        this.itemPrice = itemPrice;
    }
    public int getPrice(){
        return itemPrice;
    }

    //SET / GET ITEM QUANTITY
    public void setQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }
    public int getQuantity(){
        return itemQuantity;
    }

    //PRINT ITEM NAME / CART QUANTITY / PPU
    public void printCost(){
        System.out.print(this.getName() + " " + this.getQuantity() + " @ $" + this.getPrice());
        System.out.println(" = $" + (this.getPrice() * this.getQuantity()));
    }
    //SAME AS ABOVE WITH DIFFERENT NAME
    public void printItemCost(){
        System.out.print(this.getName() + " " + this.getQuantity() + " @ $" + this.getPrice());
        System.out.println(" = $" + (this.getPrice() * this.getQuantity()));
    }

    //PRINT TOTAL COST (PRICE * QUANTITY)
    public int printTotalCost(int price, int quantity){
        return price * quantity;
    }


}

