package com.bookmyshow.design.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bookmyshow.design.models.User;
import com.bookmyshow.design.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(
            UserRepository userRepository,
            BCryptPasswordEncoder bCryptPasswordEncoder
    ){
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User signup(String name,
                       String email,
                       String password){

        Optional<User> optionalUser = userRepository.findByEmail(email);

        User savedUser = null;

        if(optionalUser.isPresent()){
            //continue with login workflow
        }else{
            User user = new User();
            user.setEmail(email);
            user.setName(name);
            user.setPassword(bCryptPasswordEncoder.encode(password));
            savedUser = userRepository.save(user);
        }

        return savedUser;
    }
}
