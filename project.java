import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private ArrayList<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\nItems in Cart:");
        for (Product product : cartItems) {
            System.out.println(product.getName() + " - ₹" + product.getPrice());
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : cartItems) {
            total += product.getPrice();
        }

        return total;
    }
}

public class project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;

        do {
            System.out.println("\n===== E-Commerce Shopping Cart =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Calculate Total");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();

                    Product product = new Product(name, price);
                    cart.addProduct(product);
                    break;

                case 2:
                    cart.displayCart();
                    break;

                case 3:
                    System.out.println("Total Bill = ₹" + cart.calculateTotal());
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
