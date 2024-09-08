

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserFrame extends JFrame implements ActionListener {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JButton nameButton, genderButton, birthDateButton, balanceButton;
    public UserFrame(User user) {
        // Check if the user is ""
        if (user == null) {
            setTitle("Admin Information");
            // Display admin information
            JLabel adminLabel = new JLabel("You are logged in as an admin.");
            adminLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(adminLabel);
        } else {
            setTitle("User Information");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 300);
            setBackground(Color.PINK);
            cardLayout = new CardLayout();
            cardPanel = new JPanel(cardLayout);
            nameButton = createUserButton("Name", user.getImagePath());
            genderButton = createUserButton("Gender", user.getImagePath());
            birthDateButton = createUserButton("Birth Date", user.getImagePath());
            balanceButton = createUserButton("Balance", user.getImagePath());
            nameButton.addActionListener(this);
            genderButton.addActionListener(this);
            birthDateButton.addActionListener(this);
            balanceButton.addActionListener(this);
            JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
            buttonPanel.add(nameButton);
            buttonPanel.add(genderButton);
            buttonPanel.add(birthDateButton);
            buttonPanel.add(balanceButton);
            JPanel namePanel = createInfoPanel("Name: " + user.getName(), "Name", user.getImagePath());
            JPanel genderPanel = createInfoPanel("Gender: " + user.getGender(), "Gender", user.getImagePath());
            JPanel birthDatePanel = createInfoPanel("Birth Date: " + user.getBirthDate(), "Birth Date", user.getImagePath());
            JPanel balancePanel = createInfoPanel("Balance: " + user.getBalance(), "Balance", user.getImagePath());

            cardPanel.add(namePanel, "Name");
            cardPanel.add(genderPanel, "Gender");
            cardPanel.add(birthDatePanel, "Birth Date");
            cardPanel.add(balancePanel, "Balance");
            getContentPane().add(buttonPanel, BorderLayout.NORTH);
            getContentPane().add(cardPanel, BorderLayout.CENTER);
            cardPanel.setBackground(Color.decode("#E0D4F9"));
        }

        setVisible(true);
    }

    private JPanel createInfoPanel(String labelText, String pageName, String imagePath) {
        JPanel panel = new JPanel(new BorderLayout());

        if (imagePath != null && !imagePath.isEmpty()) {
            ImageIcon imageIcon = new ImageIcon(imagePath);
            int originalWidth = imageIcon.getIconWidth();
            int originalHeight = imageIcon.getIconHeight();
            int newWidth = originalWidth / 3;
            int newHeight = originalHeight / 3;
            Image image = imageIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon resizedImageIcon = new ImageIcon(image);
            JLabel imageLabel = new JLabel(resizedImageIcon);
            imageLabel.setPreferredSize(new Dimension(newWidth, newHeight)); //ขนาดรูป เดะใหญ่เกินมันตลก
            JPanel imagePanel = new JPanel(new GridBagLayout());
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.anchor = GridBagConstraints.CENTER;
            constraints.insets = new Insets(0, 10, 10, 10);
            imagePanel.add(imageLabel, constraints);
            JPanel nameLabelPanel = new JPanel(new GridBagLayout());
            GridBagConstraints nameConstraints = new GridBagConstraints();
            nameConstraints.gridx = 1;
            nameConstraints.gridy = 0;
            nameConstraints.anchor = GridBagConstraints.CENTER;
            JLabel nameLabel = new JLabel(labelText);
            nameLabel.setFont(new Font("Arial", Font.PLAIN, 25));
            nameLabelPanel.add(nameLabel, nameConstraints);
            JPanel mainPanel = new JPanel(new GridLayout(1, 2));
            mainPanel.add(imagePanel);
            mainPanel.add(nameLabelPanel);
            panel.add(mainPanel, BorderLayout.CENTER);
        } else {
            JLabel label = new JLabel(labelText);
            label.setFont(new Font("Arial", Font.PLAIN, 25));
            panel.add(label, BorderLayout.CENTER);
        }

        return panel;
    }

    private JButton createUserButton(String buttonText, String iconPath) {
        JButton button = new JButton(buttonText);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(Color.PINK); // Set button background color
        button.setForeground(Color.PINK); // Set text color on button
        button.setPreferredSize(new Dimension(100, 50)); // Set preferred size for button

        // Insert image or icon to decorate the button
        if (iconPath != null && !iconPath.isEmpty()) {
            ImageIcon icon = new ImageIcon(iconPath);
            Image img = icon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Resize the image
            button.setIcon(new ImageIcon(img));
        }

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.show(cardPanel, e.getActionCommand());
    }
}



