package com.example.demo.entity;

import jakarta.presistence.*;


public class User{
    @Id
    private Long id;
    @Column(unique=true)
    private String email;
    private String password;
    private Set<String> roels;
    private LocalDateTime createdAt;
}