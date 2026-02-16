import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {

    List<Product> cart = new ArrayList<>();

    void addProduct(Product p) {
        cart.add(p);
    }
    
    void removeProduct(String name) {
        cart.removeIf(p -> p.name.equalsIgnoreCase(name));
    }

    double totalCost() {
        double sum = 0;
        for (Product p : cart) {
            sum += p.price;
        }
        return sum;
    }

    void displayCart() {
        for (Product p : cart) {
            System.out.println("Product Name: " + p.name);
            System.out.println("Product Price: " + p.price); 
        }
        System.out.println("Total Cost of all Products: " + totalCost());
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(new Product("Laptop", 50000));
        sc.addProduct(new Product("Mouse", 2000));
        sc.addProduct(new Product("Keyboard", 1500));
        sc.displayCart();
        sc.removeProduct("Mouse");
        sc.displayCart();
    }
}