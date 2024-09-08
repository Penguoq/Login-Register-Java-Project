

public class User {
    private String username;
    private String password;
    private String name;
    private String gender;
    private String birthDate;
    private double balance;
    private String imagePath; // New field for storing the image path

    public User(String username, String password, String name, String gender, String birthDate, double balance , String imagePath) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.balance = balance;
        this.imagePath = imagePath; // Assign the provided image path
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getBalance() {
        return balance;
    }
    

    // Setter methods
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getImagePath() {
        return imagePath;
    }
}