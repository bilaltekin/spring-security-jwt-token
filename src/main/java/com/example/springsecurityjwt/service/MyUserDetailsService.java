package com.example.springsecurityjwt.service;

import com.example.springsecurityjwt.model.MyUserDetails;
import com.example.springsecurityjwt.model.User;
import com.example.springsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

     @Autowired
     UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
         Optional<User> user= userRepository.findByUserName(userName);

         user.orElseThrow(() -> new UsernameNotFoundException("User not found "+userName));
         return user.map(MyUserDetails::new).get();

    }
}