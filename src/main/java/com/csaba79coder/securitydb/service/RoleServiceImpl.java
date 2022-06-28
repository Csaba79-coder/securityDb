package com.csaba79coder.securitydb.service;

import com.csaba79coder.securitydb.model.Role;
import com.csaba79coder.securitydb.model.User;
import com.csaba79coder.securitydb.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public void saveRole(String email, Role role) {
        roleRepository.save(role);
    }
}
