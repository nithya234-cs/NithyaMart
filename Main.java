package backend;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        ProductDAO productDAO = new ProductDAO();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00"); // format currency

        // Register Seller
        System.out.print("Enter Seller Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Seller Password: ");
        String password = sc.nextLine();

        User seller = new User(1, email, password, false, true);
        userDAO.register(seller);

        // Login Seller
        System.out.print("Enter Login Email: ");
        String loginEmail = sc.nextLine();
        System.out.print("Enter Login Password: ");
        String loginPassword = sc.nextLine();

        User loggedInSeller = userDAO.login(loginEmail, loginPassword);
        if (loggedInSeller != null && loggedInSeller.isVendor()) {
            System.out.println("\n✅ Login successful!");

            // Add Product
            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();
            System.out.print("Enter Product Price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.print("Enter Product Category: ");
            String category = sc.nextLine();
            System.out.print("Enter Stock Quantity: ");
            int stock = sc.nextInt();

            Product product = new Product(1, productName, productPrice, category, stock, seller.getId());
            productDAO.addProduct(product);

            // Professional Output Visualization
            System.out.println("\n=== Product List ===");
            System.out.printf("%-15s %-15s %-15s %-10s%n", "Name", "Category", "Price", "Stock");
            System.out.println("-----------------------------------------------------------");
            for (Product p : productDAO.getProducts()) {
                System.out.printf("%-15s %-15s ₹%-14s %-10d%n",
                        p.getName(),
                        p.getCategory(),
                        df.format(p.getPrice()),
                        p.getStock());
            }
        } else {
            System.out.println("❌ Login failed.");
        }

        sc.close();
    }
}
