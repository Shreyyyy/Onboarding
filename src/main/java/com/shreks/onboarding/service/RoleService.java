package com.shreks.onboarding.service;

import com.shreks.onboarding.data.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRole();

    void saveRole(Role role);

    Role getRoleById(Integer roleId);

    void deleteRoleById(Integer roleId);

    void updateRole(Role role);
}
