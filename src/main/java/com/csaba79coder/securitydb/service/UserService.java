package com.csaba79coder.securitydb.service;

import com.csaba79coder.securitydb.model.Role;
import com.csaba79coder.securitydb.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();

    void saveUser(User user);
}
