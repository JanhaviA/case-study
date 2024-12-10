import java.util.ArrayList;
import java.util.List;

public class Product {
    public static void main(String[] args) {
        // Create a product instance
        Product product = new Product;

        // Print product details
        System.out.println(product.toString());
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: $" +price ;
    }
}