package com.trpg.myprj.service;

import com.trpg.myprj.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    User getUserById(int userId);
    boolean addUser(User user);
    boolean modifyUser(User user);
    User login(User user);

}
