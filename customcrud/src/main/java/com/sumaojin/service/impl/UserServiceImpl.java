package com.sumaojin.service.impl;

import com.sumaojin.dao.UserDao;
import com.sumaojin.entity.User;
import com.sumaojin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User login(String mobile, String password) {
        return userDao.login(mobile, password);
    }

    @Override
    public void deleteUser(String id) {
        userDao.deleteUser(id);
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
