/**
 * @Author Vinu Sagar Maintained by Nooble ®
 * Licensed to Notyfyd
 */

package com.nooble.controller;

import com.nooble.entity.User;
import com.nooble.repository.RoleRepository;
import com.nooble.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private RoleRepository roleRepository;
    private UserRepository userRepository;
    @PostMapping("/user/create")
    public void createUser(@RequestBody User user){
        userRepository.save(user);
    }
}
