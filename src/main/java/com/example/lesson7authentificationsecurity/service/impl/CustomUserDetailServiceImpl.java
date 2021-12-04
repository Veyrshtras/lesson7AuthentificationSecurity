package com.example.lesson7authentificationsecurity.service.impl;

import com.example.lesson7authentificationsecurity.dto.CustomUserDetail;
import com.example.lesson7authentificationsecurity.entity.User;
import com.example.lesson7authentificationsecurity.repository.UserRepository;
import com.example.lesson7authentificationsecurity.service.CustomUserDetailService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailServiceImpl implements CustomUserDetailService {

    private final UserRepository userRepository;

    public CustomUserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user=userRepository.findByEmail(username);
        return user.map(CustomUserDetail::new)
                .orElse(null);
    }


}
