package com.dop.onlinecatering;

import com.dop.onlinecatering.payload.properties.FileStoreProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableJpaAuditing
@EnableConfigurationProperties({
        FileStoreProperties.class
})
@SpringBootApplication
public class OnlineCateringApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineCateringApplication.class, args);
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
