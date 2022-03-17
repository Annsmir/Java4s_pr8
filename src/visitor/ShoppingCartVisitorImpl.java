package visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Computer computer) {
        int cost = 0;
        if (computer.getCost()>15000) { // 50$ скидка
            cost = computer.getCost() - 50;
        }
        else {
            cost = computer.getCost();
        }
        System.out.println("Computer added to cart. Serial number: " + computer.getSerialNumber() + ", cost: " + cost);
        return cost;
    }

    @Override
    public int visit(Printer printer) {
        int cost = printer.getPriceOfCartridge() * printer.getNoOfCartridge();
        System.out.println("Printer added to cart. Serial number: " + printer.getModelNumber() + ", cost: " + cost);
        return cost;
    }
}
