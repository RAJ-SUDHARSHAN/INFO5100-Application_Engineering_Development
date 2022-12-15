public class ProductBuilder {
    private String name;
    private int price;
    private int quantity;

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product build() {
        return new Product(name, price, quantity);
    }

}
