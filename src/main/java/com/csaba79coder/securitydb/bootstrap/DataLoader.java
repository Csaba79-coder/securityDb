package com.csaba79coder.securitydb.bootstrap;

import com.csaba79coder.securitydb.model.User;
import com.csaba79coder.securitydb.repository.RoleRepository;
import com.csaba79coder.securitydb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public DataLoader(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        User anett = new User("anett@gmail.com", "1234", "Anett", "Kiss");
        userRepository.save(anett);
        User csaba = new User("csaba@gmail.com", "1234", "Csaba", "Big");
        userRepository.save(csaba);
    }
}
