package com.example.SpringSecurity.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "role") // giving our own table name
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    // mapped by required so that it understands that this field is already mapped
    // before
    private Set<User> users;
}
