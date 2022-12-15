public class SingletonDemo {
    public static void main(String[] args) {

        // Get the only object available
        SaleProducts object = SaleProducts.getInstance();

        // show the message
        object.showOffer();
    }
}
