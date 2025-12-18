package com.example.demo.repository;
import org.springframework.data.Jpa.repository.JpaRepository;
import com.example.demo.entity.University;
public interface UniversityRepository extends JpaRepository<User, Long>{
    
} 