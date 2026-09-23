package exercice_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create 2 products
        Product product1 = new Product(1L, "Product 1", 950L, true);
        System.out.println("---- First product created ----");
        System.out.println("Name: " + product1.getName());
        System.out.println("Price: " + product1.getFormattedPrice() + "€");
        System.out.println("Available: " + product1.isAvailable());


        Product product2 = new Product(2L, "Product 2", 1500L, false);
        System.out.println("---- Second product created ----");
        System.out.println("Name: " + product2.getName());
        System.out.println("Price: " + product2.getFormattedPrice() + "€");
        System.out.println("Available: " + product2.isAvailable());

        // Apply a discount to the first product
        product1.applyDiscount(12.0);
        System.out.println("---- After applying 12% discount to the first product ----");
        System.out.println("Name: " + product1.getName());
        System.out.println("Price: " + product1.getFormattedPrice() + "€"); 
    }
}
