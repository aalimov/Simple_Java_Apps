//@author Alimov Alex
import java.util.Scanner;
public class ShoppingCartPrinter{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        ItemToPurchase item1 = new ItemToPurchase();
        System.out.println("Item 1");
        System.out.println("Enter the item name:");

        item1.setName(input.nextLine());
        System.out.println("Enter the item price:");

        item1.setPrice(input.nextInt());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(input.nextInt());

        System.out.println();

        ItemToPurchase item2 = new ItemToPurchase();
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        item2.setName(input2.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(input2.nextInt());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(input2.nextInt());


        //FIXME: WRITE A METHOD TO CALCULATE TOTAL FOR ALL ITEMS
        System.out.println("TOTAL COST");

        item1.printCost();
        item2.printCost();
        System.out.println("Total: $" + (item1.printTotalCost(item1.getPrice(), item1.getQuantity())
                         + item2.printTotalCost(item2.getPrice(), item2.getQuantity())));

    }

}