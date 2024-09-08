
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private Map<String, User> users;
    private Admin admin;

    public LoginFrame() {
        users = UserMockData.generateMockUsers(); //  mock users
        admin = new Admin("Admin123", "12345");

        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 200);
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setForeground(Color.PINK);
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(usernameLabel, constraints);

        usernameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(usernameField, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.pink);
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(passwordField, constraints);

        JButton loginButton = new JButton("Login");
        loginButton.setForeground(Color.PINK);
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(loginButton, constraints);

        JButton registerButton = new JButton("Register");
        registerButton.setForeground(Color.PINK);
        constraints.gridx = 1;
        constraints.gridy = 2;
        add(registerButton, constraints);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameField.getText();
                String enteredPassword = new String(passwordField.getPassword());
        
                if (enteredUsername.equals(admin.getUsername()) && enteredPassword.equals(admin.getPassword())) {
                    // If admin logs in, show user list
                    new UserListFrame(users); // Pass the users map to UserListFrame
                    dispose(); // Dispose the login frame
                } else if (users.containsKey(enteredUsername) && users.get(enteredUsername).getPassword().equals(enteredPassword)) {
                    // If regular user logs in, show user frame
                    new UserFrame(users.get(enteredUsername));
                    dispose(); // Dispose the login frame
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Invalid username or password");
                }
            }
        });
        


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrationFrame(users);
            }
        });

        setBackground(new Color(0, 100, 0)); //  background
        setForeground(Color.pink); //  foreground

        setVisible(true);
    }
    public static void main(String[] args) {
        new LoginFrame();
    }
    public Admin getAdmin() {
        throw new UnsupportedOperationException("Unimplemented method 'getAdmin'");
    }
}
