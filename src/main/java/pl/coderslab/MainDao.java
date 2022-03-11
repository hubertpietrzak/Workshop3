package pl.coderslab;


import java.sql.SQLException;

public class MainDao {
    public static void main(String[] args) throws SQLException {
        User user = new User();
//        user.setUserName("hubert");
//        user.setEmail("hubert@gmail.com");
//        user.setPassword("haslo");

        UserDao userDao = new UserDao();
//        userDao.create(user);

//        User user1 = new User();
//        user1.setUserName("hubert_test");
//        user1.setEmail("hubert_test@gmail.com");
//        user1.setPassword("haslo_test");
//        userDao.create(user1);

//        User read = userDao.read(5);
//        System.out.println(read);

//        User userUpdate = userDao.read(5);
//        userUpdate.setUserName("TestName");
//        userUpdate.setEmail("testeName@gmail.com");
//        userUpdate.setPassword("testpassword");
//        userDao.update(userUpdate);

//        userDao.delete(5);

//        User secondUser = new User();
//        secondUser.setUserName("test_test2");
//        secondUser.setEmail("test_test2@test.pl");
//        secondUser.setPassword("test_pass");
//        userDao.create(secondUser);
        User[] all = userDao.findAll();
//        System.out.println(all.length);
        for (User u : all) {
            System.out.println(u);
        }

    }
}
