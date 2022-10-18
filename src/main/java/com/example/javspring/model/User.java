package com.example.javspring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CHELSEA")
@Data
public class User {

    @Id
    @GeneratedValue()
    private Long id;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLES")
    private String roles;
}
