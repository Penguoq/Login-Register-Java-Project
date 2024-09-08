
import java.util.HashMap;
import java.util.Map;

public class UserMockData {

    public static Map<String, User> generateMockUsers() {
        Map<String, User> users = new HashMap<>();
    
        // สร้างข้อมูลสำหรับ User 1
        String username1 = "User1";
        String password1 = "pass1";
        String name1 = "สมชาย ผมเหลือง";
        String gender1 = "Male";
        String dob1 = "1995-05-15"; // วันเกิดของ User 1
        double balance1 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath1 = "/Users/worachotteerak/Downloads/2+.jpg";
        User user1 = new User(username1, password1, name1, gender1, dob1, balance1,"/Users/worachotteerak/Downloads/2+.jpg");
        users.put(username1, user1);
    
        // สร้างข้อมูลสำหรับ User 2
        String username2 = "User2";
        String password2 = "pass2";
        String name2 = "เด็กหญิงหมีนํ้าตาล ";
        String gender2 = "Female";
        String dob2 = "1992-11-30"; // วันเกิดของ User 2
        double balance2 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath2 = "/Users/worachotteerak/Downloads/Unknown-3.jpg";
        User user2 = new User(username2, password2, name2, gender2, dob2, balance2,"/Users/worachotteerak/Downloads/Unknown-3.jpg");
        users.put(username2, user2);
    
        // สร้างข้อมูลสำหรับ User 3
        String username3 = "User3";
        String password3 = "pass3";
        String name3 = "เด็กชายด็อกด็อก แด็กแด็ก";
        String gender3 = "Male";
        String dob3 = "1990-08-22"; // วันเกิดของ User 3
        double balance3 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath3 = "/Users/worachotteerak/Downloads/Unknown-2.jpg";
        User user3 = new User(username3, password3, name3, gender3, dob3, balance3,"/Users/worachotteerak/Downloads/Unknown-2.jpg");
        users.put(username3, user3);
    
        // สร้างข้อมูลสำหรับ User 4
        String username4 = "User4";
        String password4 = "pass4";
        String name4 = "เด็กชายปลานีโม่";
        String gender4 = "Male";
        String dob4 = "1988-09-10"; // วันเกิดของ User 4
        double balance4 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath4 = "/Users/worachotteerak/Downloads/!!!ice bear!!!.jpg";
        User user4 = new User(username4, password4, name4, gender4, dob4, balance4,"/Users/worachotteerak/Downloads/!!!ice bear!!!.jpg");
        users.put(username4, user4);
    
        // สร้างข้อมูลสำหรับ User 5
        String username5 = "User5";
        String password5 = "pass5";
        String name5 = "เด็กหญิงแว่น ไร้ตา";
        String gender5 = "Female";
        String dob5 = "1987-03-25"; // วันเกิดของ User 5
        double balance5 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath5 = "/Users/worachotteerak/Downloads/ -8.jpg";
        User user5 = new User(username5, password5, name5, gender5, dob5, balance5,"/Users/worachotteerak/Downloads/ -8.jpg");
        users.put(username5, user5);
    
        // สร้างข้อมูลสำหรับ User 6
        String username6 = "User6";
        String password6 = "pass6";
        String name6 = "เด็กชาย ทางม้าลาย";
        String gender6 = "Male";
        String dob6 = "1985-12-12"; // วันเกิดของ User 6
        double balance6 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath6 = "/Users/worachotteerak/Downloads/ -7.jpg";
        User user6 = new User(username6, password6, name6, gender6, dob6, balance6,"/Users/worachotteerak/Downloads/ -7.jpg");
        users.put(username6, user6);
    
        // สร้างข้อมูลสำหรับ User 7
        String username7 = "User7";
        String password7 = "pass7";
        String name7 = "เด็กหญิงอะไร จําไม่ได้";
        String gender7 = "Female";
        String dob7 = "1983-07-18"; // วันเกิดของ User 7
        double balance7 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath7 = "/Users/worachotteerak/Downloads/ -6.jpg";
        User user7 = new User(username7, password7, name7, gender7, dob7, balance7,"/Users/worachotteerak/Downloads/ -6.jpg");
        users.put(username7, user7);
    
        // สร้างข้อมูลสำหรับ User 8
        String username8 = "User8";
        String password8 = "pass8";
        String name8 = "เด็กชายตัวพ่อ หน้าแม่";
        String gender8 = "Male";
        String dob8 = "1981-05-06"; // วันเกิดของ User 8
        double balance8 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath8 = "/Users/worachotteerak/Downloads/ -5.jpg";
        User user8 = new User(username8, password8, name8, gender8, dob8, balance8,"/Users/worachotteerak/Downloads/ -5.jpg");
        users.put(username8, user8);
    
        // สร้างข้อมูลสำหรับ User 9
        String username9 = "User9";
        String password9 = "pass9";
        String name9 = "ชินโนะ ซูเกะ 2";
        String gender9 = "Female";
        String dob9 = "1979-09-03"; // วันเกิดของ User 9
        double balance9 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath9 = "/Users/worachotteerak/Downloads/ -4.jpg";
        User user9 = new User(username9, password9, name9, gender9, dob9, balance9,"/Users/worachotteerak/Downloads/ -4.jpg");
        users.put(username9, user9);
    
        // สร้างข้อมูลสำหรับ User 10
        String username10 = "User10";
        String password10 = "pass10";
        String name10 = "ชินโนะ ซูเกะ";
        String gender10 = "Male";
        String dob10 = "1977-11-24"; // วันเกิดของ User 10
        double balance10 = Math.random() * 10000 + 1000; // ยอดเงินสุ่ม
        String imagePath10 = "/Users/worachotteerak/Downloads/ -3.jpg";
        User user10 = new User(username10, password10, name10, gender10, dob10, balance10,"/Users/worachotteerak/Downloads/ -3.jpg");
        users.put(username10, user10);
    
        return users;
    }
}
    
    