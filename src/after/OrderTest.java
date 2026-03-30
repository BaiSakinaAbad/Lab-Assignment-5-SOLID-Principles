public class OrderTest {

  public static void main(String[] args) {
    
    Calculatable calculator = new OrderCalculator();
    Placeable placer = new OrderPlacer();
    Invoiceable invoicer = new InvoiceGenerator();
    Notifiable notifier = new EmailNotifier();

 
    calculator.calculateTotal(10.0, 2);
    placer.placeOrder("John Doe", "123 Main St");

    // Optional operations — only used when needed
    invoicer.generateInvoice("order_123.pdf");
    notifier.sendEmailNotification("johndoe@example.com");
  }
}
