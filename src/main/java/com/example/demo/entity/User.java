package com.example.demo.entity;

import jakarta.presistence.*;


public class User{
    @Id
    GenratedValue(Strategy=GenrationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String email;
    private String password;
    public User(Long id, String email, String password, Set<String> roels, LocalDateTime createdAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles= roles;
        this.createdAt = createdAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRoles(Set<String> roles) {
        this.roles= roles;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
