package com.trpg.myprj.dao;

import com.trpg.myprj.entity.FxRole;

import java.util.List;

public interface FxRoleDao {
    List<FxRole> queryFxRole();
    FxRole queryFxRoleByName(String roleName);
    int insertFxRoleBase(FxRole role);
    int insertFxRoleDetail(FxRole role);
    int updateFxRole(FxRole role);
    int deleteFxRole(int roleId);
}
