package com.geekster.ecommerceAPI.controller;

import com.geekster.ecommerceAPI.model.User;
import com.geekster.ecommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    //    Task -- 1 -- Create Users --> Crud Repository (CR) method
    @PostMapping("users")
    public String createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //    Task -- 2 -> Get user by user_id //GET // I will get user by Custom Finder(CF)
    @GetMapping("users/userId/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
}
