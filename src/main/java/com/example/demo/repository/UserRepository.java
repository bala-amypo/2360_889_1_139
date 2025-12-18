package com.example.demo.repository;
import org.springframework.data.Jpa.repository.JpaRepository;
import com.example.demo.entity.User;
public interface UserRepository extends JpaRepository<User, Long>{
    
} 