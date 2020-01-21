package com.trpg.myprj.service.impl;

import com.trpg.myprj.dao.UserDao;
import com.trpg.myprj.entity.User;
import com.trpg.myprj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public User getUserById(int userId) {
        return null;
    }

    @Override
    public boolean addUser(User user) {
        if(user.getUserName() != null && "".equals(user.getUserName())){
            user.setUserId(1);
            try {
                int effecctedNum = userDao.insertUser(user);
                if(effecctedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("创建角色失败");
                }
            }catch (Exception e){
                throw new RuntimeException("创建角色失败:" + e.getMessage());
            }
        }else {
            throw new RuntimeException("角色名不能为空！");
        }
    }

    @Override
    public boolean modifyUser(User user) {
        return false;
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByAccount(user.getAccount());
    }
}
