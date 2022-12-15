public class SaleProducts {

   // create an object of SingleObject
   private static SaleProducts instance = new SaleProducts();

   // make the constructor private so that this class cannot be
   // instantiated
   private SaleProducts() {
   }

   // Get the only object available
   public static SaleProducts getInstance() {
      return instance;
   }

   public void showOffer() {
      System.out.println("Sale Products: Microsoft VR Wearable Device Model X");
   }
}