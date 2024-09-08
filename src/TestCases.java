import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class TestCases {

    @Test
    public void testAdmin() {
        Admin admin = new Admin("Admin123", "12345");
        assertEquals("Admin123", admin.getUsername());
        assertEquals("12345", admin.getPassword());
    }

    @Test
    public void testUser() {
        String username = "user2";
        String password = "password2";
        String name = "kaiTok";   
        String gender = "Male";
        String dob = "1990-01-01";
        double balance = 1000.0;
        String imagePath = "/Users/worachotteerak/Downloads/ -14.jpg";

        User user = new User(username, password, name, gender, dob, balance, imagePath);

        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());
        assertEquals(name, user.getName());
        assertEquals(gender, user.getGender());
        assertEquals(dob, user.getBirthDate());
        assertEquals(balance, user.getBalance(), 0.001); // Assuming a delta value for double comparison
        assertEquals(imagePath, user.getImagePath());
    }

    @Test
    public void testUserMockData() {
        Map<String, User> users = UserMockData.generateMockUsers();
        assertNotNull(users);
        assertEquals(10, users.size());
    }

   

}
