package siliconvalley.dao;

import siliconvalley.model.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u").getResultList();
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(long id, User user) {
        User userToUpdate = entityManager.find(User.class, id);
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setNickName(user.getNickName());
        userToUpdate.setName(user.getName());
        userToUpdate.setLadder(user.getLadder());
    }

    @Override
    public void deleteUser(long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}