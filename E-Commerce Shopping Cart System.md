**import java.util.\*;**



**class Product {**

&#x20;   **int id;**

&#x20;   **String name;**

&#x20;   **double price;**

&#x20;   **int quantity;**



&#x20;   **Product(int id, String name, double price, int quantity) {**

&#x20;       **this.id = id;**

&#x20;       **this.name = name;**

&#x20;       **this.price = price;**

&#x20;       **this.quantity = quantity;**

&#x20;   **}**



&#x20;   **double getTotal() {**

&#x20;       **return price \* quantity;**

&#x20;   **}**



&#x20;   **void display() {**

&#x20;       **System.out.println(id + ". " + name + " - ₹" + price + " x " + quantity + " = ₹" + getTotal());**

&#x20;   **}**

**}**



**class Cart {**

&#x20;   **ArrayList<Product> products = new ArrayList<>();**



&#x20;   **void addProduct(Product p) {**

&#x20;       **products.add(p);**

&#x20;   **}**



&#x20;   **void removeProduct(int id) {**

&#x20;       **products.removeIf(p -> p.id == id);**

&#x20;   **}**



&#x20;   **double calculateTotal() {**

&#x20;       **double total = 0;**

&#x20;       **for (Product p : products) {**

&#x20;           **total += p.getTotal();**

&#x20;       **}**

&#x20;       **return total;**

&#x20;   **}**



&#x20;   **void displayCart() {**

&#x20;       **if (products.isEmpty()) {**

&#x20;           **System.out.println("Cart is empty!");**

&#x20;           **return;**

&#x20;       **}**



&#x20;       **System.out.println("\\nProducts in Cart:");**

&#x20;       **for (Product p : products) {**

&#x20;           **p.display();**

&#x20;       **}**



&#x20;       **double total = calculateTotal();**

&#x20;       **double discount = total \* 0.10;**

&#x20;       **double tax = (total - discount) \* 0.05;**

&#x20;       **double finalAmount = total - discount + tax;**



&#x20;       **System.out.println("\\nTotal: ₹" + total);**

&#x20;       **System.out.println("Discount (10%): ₹" + discount);**

&#x20;       **System.out.println("Tax (5%): ₹" + tax);**

&#x20;       **System.out.println("Final Amount: ₹" + finalAmount);**

&#x20;   **}**

**}**



**public class ShoppingCartSystem {**

&#x20;   **public static void main(String\[] args) {**

&#x20;       **Scanner sc = new Scanner(System.in);**

&#x20;       **Cart cart = new Cart();**



&#x20;       **while (true) {**

&#x20;           **System.out.println("\\n1. Add Product");**

&#x20;           **System.out.println("2. Remove Product");**

&#x20;           **System.out.println("3. View Cart");**

&#x20;           **System.out.println("4. Exit");**

&#x20;           **System.out.print("Choice: ");**



&#x20;           **int choice = sc.nextInt();**



&#x20;           **switch (choice) {**

&#x20;               **case 1:**

&#x20;                   **System.out.print("Enter ID: ");**

&#x20;                   **int id = sc.nextInt();**

&#x20;                   **sc.nextLine();**



&#x20;                   **System.out.print("Enter Name: ");**

&#x20;                   **String name = sc.nextLine();**



&#x20;                   **System.out.print("Enter Price: ");**

&#x20;                   **double price = sc.nextDouble();**



&#x20;                   **System.out.print("Enter Quantity: ");**

&#x20;                   **int qty = sc.nextInt();**



&#x20;                   **cart.addProduct(new Product(id, name, price, qty));**

&#x20;                   **break;**



&#x20;               **case 2:**

&#x20;                   **System.out.print("Enter Product ID to remove: ");**

&#x20;                   **int removeId = sc.nextInt();**

&#x20;                   **cart.removeProduct(removeId);**

&#x20;                   **break;**



&#x20;               **case 3:**

&#x20;                   **cart.displayCart();**

&#x20;                   **break;**



&#x20;               **case 4:**

&#x20;                   **System.exit(0);**



&#x20;               **default:**

&#x20;                   **System.out.println("Invalid choice!");**

&#x20;           **}**

&#x20;       **}**

&#x20;   **}**

**}**

