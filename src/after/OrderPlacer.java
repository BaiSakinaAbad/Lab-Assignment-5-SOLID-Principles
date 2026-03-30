
// Single Responsibility Principle (SRP):

public class OrderPlacer implements Placeable {

  @Override
  public void placeOrder(String customerName, String address) {

    System.out.println("Order placed for " + customerName + " at " + address);
  }
}
