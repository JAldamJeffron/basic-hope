import java.util.*;

class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%s: $%.2f (Rating: %.1f)", name, price, rating);
    }
}

public class Task {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000, 4.5));
        products.add(new Product("Smartphone", 500, 4.7));
        products.add(new Product("Tablet", 300, 4.2));
        products.add(new Product("Headphones", 200, 4.8));

    }
}