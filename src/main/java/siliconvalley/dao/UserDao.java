package siliconvalley.dao;

import siliconvalley.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(long id);
    void add(User user);
    void update(long id, User user);
    void delete(long id);
}
