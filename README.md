# Lab Assignment 5 — SOLID Principles

The original code violates the **Single Responsibility Principle (SRP)** and the **Interface Segregation Principle (ISP)**. The `OrderAction` class bundles four unrelated responsibilities — calculating totals, placing orders, generating invoices, and sending emails — into a single class, giving it multiple reasons to change. Meanwhile, the monolithic `Order` interface forces every implementing class to provide all four methods, even when only a subset is needed.

To fix these violations, the monolithic `Order` interface was split into four focused interfaces — `Calculatable`, `Placeable`, `Invoiceable`, and `Notifiable` — so that clients only depend on what they need (ISP). Each responsibility was then extracted into its own class — `OrderCalculator`, `OrderPlacer`, `InvoiceGenerator`, and `EmailNotifier` — so that each class has only one reason to change (SRP).

## Before vs. After Comparison

### Before (Violates SRP & ISP)
```java
// One bulk interface — forces all methods on every implementor
public interface Order {
  void calculateTotal(double price, int quantity);
  void placeOrder(String customerName, String address);
  void generateInvoice(String fileName);
  void sendEmailNotification(String email);
}

// One god class — has four reasons to change
public class OrderAction implements Order {
  // ... all four methods crammed in one class
}
```

### After (Follows SRP & ISP)
```java
// Segregated interfaces — clients depend only on what they need
public interface Calculatable {
  void calculateTotal(double price, int quantity);
}

public interface Placeable {
  void placeOrder(String customerName, String address);
}

public interface Invoiceable {
  void generateInvoice(String fileName);
}

public interface Notifiable {
  void sendEmailNotification(String email);
}

// Focused classes — each has exactly one reason to change
public class OrderCalculator implements Calculatable { ... }
public class OrderPlacer implements Placeable { ... }
public class InvoiceGenerator implements Invoiceable { ... }
public class EmailNotifier implements Notifiable { ... }
```
## UML
