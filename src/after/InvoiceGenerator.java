
public class InvoiceGenerator implements Invoiceable {

  @Override
  public void generateInvoice(String fileName) {
    System.out.println("Invoice generated: " + fileName);
  }
}
