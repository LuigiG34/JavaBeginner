package exercice_5;

import exercice_5.model.Product;
import exercice_5.repository.ProductRepository;
import exercice_5.exception.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create a list of 5 products
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Product 1", 10.0));
        products.add(new Product(2L, "Product 2", 20.0));
        products.add(new Product(3L, "Product 3", 30.0));
        products.add(new Product(4L, "Product 4", 40.0));
        products.add(new Product(5L, "Product 5", 50.0));

        // Create a ProductRepository with the list of products
        ProductRepository productRepository = new ProductRepository(products);

        // Test getProductById with a valid id
        try {
            Product product = productRepository.getProductById(3L);
            System.out.println("Product found: " + product.getName() + " - " + product.getPrice());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Test getProductById with an invalid id
        try {
            Product product = productRepository.getProductById(6L);
            System.out.println("Product found: " + product.getName() + " - " + product.getPrice());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
