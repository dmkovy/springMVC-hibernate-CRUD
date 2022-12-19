package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    User getUserById(long id);
    List<User> getAllUsers();
    void updateUser(User user);
    void removeUserById(long id);

}
