package visitor;
import java.util.*;

public class Customer {
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Computer(20000, "comp123"), new Computer(14500, "comp456"),
                new Printer(1000, 6, "HP 302x"), new Printer(975, 3,"Xerox 3d px")
        };
        int totalCost = calculatePrice(items);
        System.out.println("Total cost: " + totalCost);
    }
    private static int calculatePrice(Item[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (Item item:items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
