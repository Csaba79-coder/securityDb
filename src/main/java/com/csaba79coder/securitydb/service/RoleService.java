package com.csaba79coder.securitydb.service;

import com.csaba79coder.securitydb.model.Role;
import com.csaba79coder.securitydb.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleService {

    List<Role> findAll();

    void saveRole(String email, Role role);
}
