package siliconvalley.service;

import siliconvalley.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User giveUserOnlySex(User user);
    User getUserById(long id);
    void add(User user);
    void updateUser(User user);
    void removeUser(long id);
    void removeUserById(long id);
}
