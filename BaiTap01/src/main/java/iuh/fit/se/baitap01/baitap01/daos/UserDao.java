package iuh.fit.se.baitap01.baitap01.daos;

import iuh.fit.se.baitap01.baitap01.entites.User;

import java.util.List;

public interface UserDao {
    public void insertUser(User user) throws Exception;
    public List<User> getAllUsers() throws Exception;
}
