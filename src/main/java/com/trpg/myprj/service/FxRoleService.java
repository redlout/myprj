package com.trpg.myprj.service;

import com.trpg.myprj.entity.FxRole;

import java.util.List;

public interface FxRoleService {
    List<FxRole> getFxRoleList();
    FxRole getFxRoleByName                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         (String fxRoleName);
    boolean addFxRole(FxRole fxRole);
    boolean modifyFxRole(FxRole fxRole);
    boolean deleteFxRole(int fxRoleId);
}
