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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToMany(targetEntity = User.class, mappedBy = "roles")
    private List<User> users;
}
