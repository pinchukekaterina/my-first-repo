public abstract class ProductBuilder {
    protected Product1 product = new Product1();

    public abstract void buildPart1();
    public abstract void buildPart2();
    public abstract void buildPart3();

    public Product1 getProduct() {
        return product;
    }
}
