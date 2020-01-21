package com.trpg.myprj.dao;

import com.trpg.myprj.entity.FxRole;
import com.trpg.myprj.entity.User;

import java.util.List;


public interface UserDao {
    List<User> queryUser();
    User queryUserByAccount(String userAccount);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int userId);
}
