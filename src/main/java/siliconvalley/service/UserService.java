package siliconvalley.service;

import siliconvalley.model.User;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();
    User getUserById(long id);
    void add(User user);
    void update(long id, User user);
    void delete(long id);
}
