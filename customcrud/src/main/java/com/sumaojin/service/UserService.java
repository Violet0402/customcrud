package com.sumaojin.service;

import com.sumaojin.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

    User login(String mobile, String password);

    void deleteUser(String id);

    User findById(String id);

    void update(User user);

    void save(User user);
}
