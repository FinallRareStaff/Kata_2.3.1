package siliconvalley.service;

import siliconvalley.dao.UserDao;
import siliconvalley.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(long id) {
        return dao.getUserById(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(long id, User user) {
        dao.update(id, user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        dao.deleteUser(id);
    }
}
