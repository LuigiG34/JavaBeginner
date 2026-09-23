package exercice_1;

public class Product {
    private Long id;
    private String name;
    private Long price; // Price stored in cents to avoid floating-point precision issues
    private Boolean available;

    public Product(Long id, String name, Long price, Boolean available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.available = available;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    // Additional methods
    public String getFormattedPrice() {
        if (this.price == null) {
            return "0.00";
        }
        return String.format("%.2f", this.price / 100.0); // Always outputs "9.50"
    }

    public void applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
        }

        if (this.price != null) {
            // Calculate discounted price and round to the nearest cent
            double discountedPrice = this.price * (1.0 - (percentage / 100.0));
            this.price = Math.round(discountedPrice);
        }
    }
}
