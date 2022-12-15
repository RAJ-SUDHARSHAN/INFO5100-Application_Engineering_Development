public class BuilderDemo {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .setName("Product Name")
                // .setPrice(100)
                // .setQuantity(2)
                .build();

        System.out.println("Product: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
    }

}
