
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Map;

public class RegistrationFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField nameField;
    private JTextField genderField;
    private JTextField dobField;
    private JTextField balanceField;
    private JLabel imagePathLabel;
    public RegistrationFrame(Map<String, User> users) {
        setTitle("Register");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); // Add ช่องไฟของ components

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
        passwordLabel.setForeground(Color.PINK);
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(passwordField, constraints);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.PINK);
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(nameLabel, constraints);

        nameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        add(nameField, constraints);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setForeground(Color.PINK);
        constraints.gridx = 0;
        constraints.gridy = 3;
        add(genderLabel, constraints);

        genderField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 3;
        add(genderField, constraints);

        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setForeground(Color.PINK);
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(dobLabel, constraints);

        dobField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 4;
        add(dobField, constraints);

        JLabel balanceLabel = new JLabel("Balance:");
        balanceLabel.setForeground(Color.PINK);
        constraints.gridx = 0;
        constraints.gridy = 5;
        add(balanceLabel, constraints);

        balanceField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 5;
        add(balanceField, constraints);

        JLabel imagePathInputLabel = new JLabel("Image Path:");
        imagePathInputLabel.setForeground(Color.PINK);
        constraints.gridx = 0;
        constraints.gridy = 6;
        add(imagePathInputLabel, constraints);

        JButton browseButton = new JButton("Browse");
        browseButton.setForeground(Color.PINK);
        constraints.gridx = 1;
        constraints.gridy = 6;
        add(browseButton, constraints);

        imagePathLabel = new JLabel();
        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        add(imagePathLabel, constraints);

        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif");
                fileChooser.setFileFilter(filter);
                int returnVal = fileChooser.showOpenDialog(RegistrationFrame.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    imagePathLabel.setText(file.getAbsolutePath());
                }
            }
        });

        JButton registerButton = new JButton("Register");
        registerButton.setForeground(Color.PINK);
        constraints.gridx = 1;
        constraints.gridy = 8;
        add(registerButton, constraints);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String name = nameField.getText();
                String gender = genderField.getText();
                String dob = dobField.getText();
                double balance = Double.parseDouble(balanceField.getText());
                String imagePath = imagePathLabel.getText(); // Get the selected image path

                // Create a new user
                User newUser = new User(username, password, name, gender, dob, balance, imagePath);

                // Add the new user to the map
                users.put(username, newUser);

                // Inform the user that registration is successful
                JOptionPane.showMessageDialog(RegistrationFrame.this, "Registration successful");

                // Dispose the registration frame
                dispose();
            }
        });

        setVisible(true);
    }

    public void setUsernameField(String string) {
     
        throw new UnsupportedOperationException("Unimplemented method 'setUsernameField'");
    }

    public void setPasswordField(String string) {
      
        throw new UnsupportedOperationException("Unimplemented method 'setPasswordField'");
    }

    public void setNameField(String string) {
     
        throw new UnsupportedOperationException("Unimplemented method 'setNameField'");
    }

    public void setGenderField(String string) {
       
        throw new UnsupportedOperationException("Unimplemented method 'setGenderField'");
    }

    public void setDobField(String string) {
   
        throw new UnsupportedOperationException("Unimplemented method 'setDobField'");
    }

    public void setBalanceField(String string) {
    
        throw new UnsupportedOperationException("Unimplemented method 'setBalanceField'");
    }

    public void setImagePathLabel(String string) {
  
        throw new UnsupportedOperationException("Unimplemented method 'setImagePathLabel'");
    }

    public void registerUser() {

        throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
    }
}
