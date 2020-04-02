/**
 * @Author Vinu Sagar Maintained by Nooble ®
 * Licensed to Notyfyd
 */

package com.nooble.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String password;
    @ManyToMany(targetEntity = Role.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Role> roles;
}

