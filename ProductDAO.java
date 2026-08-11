package backend;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private List<Product> products = new ArrayList<>();

    public boolean addProduct(Product product) {
        products.add(product);
        return true;
    }

    public boolean updateProduct(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == updatedProduct.getProductId()) {
                products.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(int productId) {
        return products.removeIf(p -> p.getProductId() == productId);
    }

    public List<Product> getProducts() {
        return products;
    }
}
