package com.dop.onlinecatering.bootstrap;

import com.dop.onlinecatering.model.Privilege;
import com.dop.onlinecatering.model.Role;
import com.dop.onlinecatering.model.User;
import com.dop.onlinecatering.repositories.PrivilegeRepository;
import com.dop.onlinecatering.repositories.RoleRepository;
import com.dop.onlinecatering.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.*;

@Component
public class DbSeeder implements CommandLineRunner {

    private boolean alreadySetup = false;

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PrivilegeRepository privilegeRepository;
    private final PasswordEncoder passwordEncoder;

    public DbSeeder(UserRepository userRepository, RoleRepository roleRepository, PrivilegeRepository privilegeRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.privilegeRepository = privilegeRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    Privilege createPrivilegeIfNotFound(String name) {

        Privilege privilege = privilegeRepository.findByName(name);
        if (privilege == null) {
            privilege = new Privilege(name);
            privilegeRepository.save(privilege);
        }
        return privilege;
    }

    @Transactional
    Role createRoleIfNotFound(String name, Collection<Privilege> privileges) {

        Role role = roleRepository.findByName(name);
        if (role == null) {
            role = new Role(name);
            role.setPrivileges(privileges);
            roleRepository.save(role);
        }
        return role;
    }

    @Override
    public void run(String... args) throws Exception {


        if (alreadySetup)
            return;
        Privilege readPrivilege = createPrivilegeIfNotFound("READ_PRIVILEGE");
        Privilege writePrivilege = createPrivilegeIfNotFound("WRITE_PRIVILEGE");

        List<Privilege> adminPrivileges = Arrays.asList(
                readPrivilege, writePrivilege);
        createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
        createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));

        Role adminRole = roleRepository.findByName("ROLE_ADMIN");
        User user = new User();
        user.setFirstName("aaa");
        user.setFirstName("bbb");
        user.setPhoneNumber("444444444");
        user.setCreated(new Date());
        user.setUpdated(new Date());
        user.setVerified(true);
        user.setFirstName("Test");
        user.setLastName("Test");
        user.setPassword(passwordEncoder.encode("test"));
        user.setEmail("test@test.com");
        user.setRoles(Collections.singletonList(adminRole));
        userRepository.save(user);

        alreadySetup = true;
    }


//    private final UserRepository userRepository;
//
//    public DbSeeder(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        initData();
//    }
//
//    void initData(){
//
//        User user = new User();
//
//        user.setFirstName("aaa");
//        user.setFirstName("bbb");
//        user.setPhoneNumber("444444444");
//        user.setCreated(new Date());
//        user.setUpdated(new Date());
//        user.setVerified(true);
//        userRepository.save(user);
//    }
}
