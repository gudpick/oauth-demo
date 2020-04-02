package com.nooble;

import com.nooble.entity.Role;
import com.nooble.entity.User;
import com.nooble.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class OauthDemoApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;



    @Test
    void contextLoads() {
    }
    @Test
    public void createUser() {
        User user = new User();
        user.setEmail("hello@mail.com");
        user.setPassword(passwordEncoder.encode("123"));
        user.setFirstName("hello");
        user.setLastName("world");
        user.setMobile("98657387456");
        List<Role> roleList = new ArrayList<>();
        Role role = new Role();
        role.setName("ADMIN");
        role.setDescription("Administrator");
        roleList.add(role);
        Role role1 = new Role();
        role1.setName("USER");
        role1.setDescription("User");
        roleList.add(role1);
        user.setRoles(roleList);
        userRepository.save(user);
    }

}
