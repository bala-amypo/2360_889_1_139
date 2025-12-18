package com.example.demo.entity;

import jakarta.presistence.*;


public class User{
   @Id
    private Long id;
   @Coloumn(unique=true) 
    private String name;
    private String accreitationLevel;
    private String country;
    private Boolean active
    }
    