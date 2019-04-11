package com.dop.onlinecatering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OnlineCateringApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineCateringApplication.class, args);
    }

}
