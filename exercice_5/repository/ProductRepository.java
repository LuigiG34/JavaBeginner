package exercice_5.repository;

import exercice_5.model.Product;
import exercice_5.exception.ProductNotFoundException;

import java.util.List;

public class ProductRepository {

    private List<Product> products;

    public ProductRepository(List<Product> products) {
        this.products = products;
    }

    public Product getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(
                    () -> new ProductNotFoundException("Product not found")
                );
    }
}
