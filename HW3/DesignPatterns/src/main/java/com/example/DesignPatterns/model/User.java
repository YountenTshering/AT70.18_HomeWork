package com.example.DesignPatterns.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Entity
@Data // Getter and setter and toString is auto
public class User {
    @Id
    private int uid;
    private String name;
    private String nationality;
    private String email;
}
