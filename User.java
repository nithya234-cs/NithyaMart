package backend;

public class User {
    private int id;              // unique ID
    private String email;        // unique email
    private String password;     // hashed password
    private boolean isCustomer;  // role flag
    private boolean isVendor;    // role flag

    // Constructor
    public User(int id, String email, String password, boolean isCustomer, boolean isVendor) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.isCustomer = isCustomer;
        this.isVendor = isVendor;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isCustomer() { return isCustomer; }
    public void setCustomer(boolean isCustomer) { this.isCustomer = isCustomer; }

    public boolean isVendor() { return isVendor; }
    public void setVendor(boolean isVendor) { this.isVendor = isVendor; }
}