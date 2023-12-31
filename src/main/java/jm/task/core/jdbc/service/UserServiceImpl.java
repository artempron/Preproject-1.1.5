package jm.task.core.jdbc.service;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;


import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDaoHibernate = new UserDaoHibernateImpl();

    public void createUsersTable()  {
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable()  {
        userDaoHibernate.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);

    }

    public List<User> getAllUsers() {
        List <User> list = userDaoHibernate.getAllUsers();
        list.forEach(System.out::println);
        return list;
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
    }
}
