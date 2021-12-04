package com.example.lesson7authentificationsecurity;

import com.example.lesson7authentificationsecurity.repository.impl.BaseRepositoryImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
@EnableJpaAuditing
public class Lesson7AuthenticationSecurityApplication implements CommandLineRunner {

    BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
    public static void main(String[] args) {
        SpringApplication.run(Lesson7AuthenticationSecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(encoder.encode("admin"));
    }
}
