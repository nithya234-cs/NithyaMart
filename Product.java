package backend;

public class Product {
    private int productId;
    private String name;
    private double price;
    private String category;
    private int stock;
    private int sellerId;

    public Product(int productId, String name, double price, String category, int stock, int sellerId) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.sellerId = sellerId;
    }

    // ✅ Add these getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public int getSellerId() {
        return sellerId;
    }

    // Optional setters if you want to update fields later
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
