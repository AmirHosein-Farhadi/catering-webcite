package com.dop.onlinecatering.bootstrap;

import com.dop.onlinecatering.model.Role;
import com.dop.onlinecatering.model.User;
import com.dop.onlinecatering.repositories.RoleRepository;
import com.dop.onlinecatering.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Date;

@Component
public class DbSeeder implements CommandLineRunner {

    private final UserService userService;
    private final RoleRepository roleRepository;

    public DbSeeder(UserService userService, RoleRepository roleRepository) {
        this.userService = userService;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        initData();
    }
    @Transactional
    void initData(){

        User user = new User();

        Role userRole = new Role("USER");
        Role actuatorRole = new Role("ADMIN");

        roleRepository.save(userRole);
        roleRepository.save(actuatorRole);

        user.setUsername("test");
        user.setFirstName("aaa");
        user.setLastName("bbb");
        user.setPassword("pass");
        user.setRoles(Arrays.asList(userRole, actuatorRole));
        user.setPhoneNumber("444444444");
        user.setCreated(new Date());
        user.setUpdated(new Date());
        user.setVerified(true);
        user.setActive(true);
        userService.save(user);
    }
}
