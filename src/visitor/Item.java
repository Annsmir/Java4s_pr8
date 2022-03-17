package visitor;

public interface Item {
    public int accept(ShoppingCartVisitor visitor);
}
