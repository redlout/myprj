package com.trpg.myprj.service.impl;

import com.trpg.myprj.dao.FxRoleDao;
import com.trpg.myprj.entity.FxRole;
import com.trpg.myprj.service.FxRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FxRoleServiceImpl implements FxRoleService {
    @Autowired
    private FxRoleDao fxRoleDao;
    @Override
    public List<FxRole> getFxRoleList() {
        return fxRoleDao.queryFxRole();
    }

    @Override
    public FxRole getFxRoleByName(String fxRoleName) {
        return fxRoleDao.queryFxRoleByName(fxRoleName);
    }

    @Transactional
    @Override
    public boolean addFxRole(FxRole fxRole) {
        if(fxRole.getName() != null && "".equals(fxRole.getName())){
            fxRole.setUserId(1);
            try {
                int effecctedNum = fxRoleDao.insertFxRoleBase(fxRole);
                effecctedNum = fxRoleDao.insertFxRoleDetail(fxRole);
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
    public boolean modifyFxRole(FxRole fxRole) {
        return false;
    }

    @Override
    public boolean deleteFxRole(int fxRoleId) {
        return false;
    }
}
