package com.example.SpringSecurity.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Getter
@Setter
public class User {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Incremented Value
    private int id;

    @Column(nullable = false) // database level
    @NotBlank(message = "This field is required.")
    // UI level, no need to use JavaScript, Supported by validation dependency
    private String username;

    @NotBlank(message = "This field is required.")
    @Column(nullable = false)
    private String password;

    @NotBlank(message = "This field is required.")
    @Transient
    private String passwordConfirm;

    @NotBlank(message = "This field is required.")
    // in user interface level - valid email
    @Email(message = "Invalid Email")
    private String email;

    private boolean active;

    // one user has many roles
    // one role has many roles
    // many to many relationship
    @ManyToMany(fetch = FetchType.EAGER) // Creates an intermediate table
    // User_id, Role_id (by default)
    // If we don't like this name, we can use @JoinTable (complicated)
    // (fetch) - if I get one user, should JPA also get the roles of that user?
    // (EAGER INITIALIZATION)
    // Or if I get one user, may be roles are retrieved only when asked (LAZY
    // INITIALIZATION)
    // If we use spring security, it forces user to always be EAGER
    // In many to many relationship, who is parent
    // If parent is saved, child is saved
    // Or if child is saved, parent is not saved
    @JsonBackReference
    private Set<Role> roles;

}
