package backend;

public class Customer {
    private int id;              // unique ID
    private User user;           // linked User object
    private String fullName;
    private String imageUrl;     // profile image (Cloudinary equivalent)
    private String email;
    private String phoneNumber;
    private String address;
    private String country;

    // Constructor
    public Customer(int id, User user, String fullName, String imageUrl,
                    String email, String phoneNumber, String address, String country) {
        this.id = id;
        this.user = user;
        this.fullName = fullName;
        this.imageUrl = imageUrl;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.country = country;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    // Utility method
    public String getUserFullName() {
        return fullName.trim();
    }

    @Override
    public String toString() {
        return "Customer: " + fullName + " (" + email + ")";
    }
}
