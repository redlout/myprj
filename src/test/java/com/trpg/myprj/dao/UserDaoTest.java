package com.trpg.myprj.dao;

import com.trpg.myprj.entity.User;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    @Ignore
    void queryUser() {
    }

    @Test
    @Ignore
    void queryUserById() {

    }

    @Test
    @Ignore
    void insertUser() {
        User user = new User();
        user.setPassword("123456789");
        user.setUserName("test");
        user.setEmail("sdsdsds");
        int effectedNum = userDao.insertUser(user);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    void updateUser() {
    }

    @Test
    @Ignore
    void deleteUser() {
    }
}