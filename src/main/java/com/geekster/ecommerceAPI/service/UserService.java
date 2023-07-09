package com.geekster.ecommerceAPI.service;

import com.geekster.ecommerceAPI.model.User;
import com.geekster.ecommerceAPI.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    UserRepo userRepo;

    public String createUser(User user) {
        userRepo.save(user);
        return "User Added Successfully!!!";
    }

    public User getUserById(Integer userId) {
        return userRepo.findById(userId).orElseThrow(()-> new IllegalArgumentException("User Not Found"));
    }


}
