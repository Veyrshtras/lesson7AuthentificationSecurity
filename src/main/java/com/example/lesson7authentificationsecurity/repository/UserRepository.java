package com.example.lesson7authentificationsecurity.repository;

import com.example.lesson7authentificationsecurity.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User> {

    Optional<User> findByEmail(String email);
}
