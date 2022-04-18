package siliconvalley.dao;

import org.springframework.stereotype.Repository;
import siliconvalley.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User giveUserOnlySex(User user);
    User getUserById(long id);
    void add(User user);
    void updateUser(User user);
    void removeUser(long id);
    void removeUserById(long id);
}
