package FacotryDesignePattern;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        Product productA = productFactory.createProduct("A");
        productA.performAction();

        Product productB = productFactory.createProduct("B");
        productB.performAction();
    }
}
