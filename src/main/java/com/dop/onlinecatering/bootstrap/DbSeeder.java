package com.dop.onlinecatering.bootstrap;

import com.dop.onlinecatering.model.User;
import com.dop.onlinecatering.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DbSeeder implements CommandLineRunner {

    private final UserRepository userRepository;

    public DbSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        initData();
    }

    void initData(){

        User user = new User();

        user.setFirstName("gggg");
        user.setFirstName("bbb");
        user.setPhoneNumber("444444444");
        user.setCreated(new Date());
        user.setUpdated(new Date());
        user.setVerified(true);
        userRepository.save(user);
    }
}
