package backend;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    // Simulated database (in real projects, connect to MySQL/PostgreSQL)
    private List<User> users = new ArrayList<>();

    // Register a new user
    public boolean register(User user) {
        // Check if email already exists
        for (User u : users) {
            if (u.getEmail().equalsIgnoreCase(user.getEmail())) {
                System.out.println("Registration failed: Email already exists.");
                return false;
            }
        }
        users.add(user);
        System.out.println("Registration successful for:\nEmail: " + user.getEmail());
        System.out.println("\n-----------------------------------------\nSign in process:\n");
        return true;
    }

    // Login method
    public User login(String email, String password) {
        for (User u : users) {
            if (u.getEmail().equalsIgnoreCase(email) && u.getPassword().equals(password)) {
                System.out.println("Login successful for: " + email);
                return u;
            }
        }
        System.out.println("Login failed: Invalid credentials.");
        return null;
    }

    // List all registered users (for demo)
    public void listUsers() {
        System.out.println("Registered Users:");
        for (User u : users) {
            System.out.println("- " + u.getEmail() + " (Customer: " + u.isCustomer() + ", Vendor: " + u.isVendor() + ")");
        }
    }
}
