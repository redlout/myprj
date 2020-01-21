package com.trpg.myprj.dao;

import com.trpg.myprj.entity.FxRole;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class FxRoleDaoTest {
    @Autowired
    private FxRoleDao fxRoleDao;
    @Test
    @Ignore
    void queryFxRole() {
    }

    @Test
    @Ignore
    void queryFxRoleByName() {
    }

    @Test
    void insertFxRole() {
        FxRole fxRole = new FxRole();
        fxRole.setUserId(1);
        fxRole.setAge("13");
        fxRole.setName("test");
        int effectedNum = fxRoleDao.insertFxRole(fxRole);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    void updateFxRole() {
    }

    @Test
    @Ignore
    void deleteFxRole() {
    }
}