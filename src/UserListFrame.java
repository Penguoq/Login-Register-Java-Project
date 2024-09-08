

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class UserListFrame extends JFrame {
    public UserListFrame(Map<String, User> users) {
        setTitle("User List");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(0, 1));

        for (Map.Entry<String, User> entry : users.entrySet()) {
            User user = entry.getValue();
            JButton userButton = new JButton(user.getName());
            userButton.addActionListener(e -> {
                new UserFrame(user); // Show user details when button is clicked
            });
            add(userButton);
        }

        setVisible(true);
    }
}
