package siliconvalley.dao;

import org.springframework.stereotype.Repository;
import siliconvalley.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User giveUserOnlySex(User user) {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUser(long id) {

    }

    @Override
    public void removeUserById(long id) {

    }
}
