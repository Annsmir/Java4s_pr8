package visitor;

public class Printer implements Item {
    private int priceOfCartridge;
    private int noOfCartridge;
    private String modelNumber;

    public Printer(int priceOfCartridge, int noOfCartridge, String modelNumber) {
        this.priceOfCartridge = priceOfCartridge;
        this.noOfCartridge = noOfCartridge;
        this.modelNumber = modelNumber;
    }

    public int getPriceOfCartridge() {
        return priceOfCartridge;
    }

    public int getNoOfCartridge() {
        return noOfCartridge;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
